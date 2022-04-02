package com.s0cket.day21.demo03.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    文件上传案例服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写"上传成功"

    明确：
        数据源：客户端上传的文件
        目的地：服务器的硬盘 /Users/yanzhang/Desktop/upload/a.jpg

    步骤：
        1、创建一个服务器SocketServer对象，和系统要制定的端口号
        2、使用SocketServer对象中的accept方法，获取请求的客户端socket对象
        3、使用Socket对象的getInputStream()，获取网络字节输入流对象
        4、判断/Users/yanzhang/Desktop/upload是否存在，不存在即创建目录
        5、创建一个本地字节输出流FileOutputStream对象，构造方法中绑定需要输出的目的地
        6、使用网络字节输入流对象的read()方法，读取客户端上传的文件
        7、使用本地字节输出流对象的write()方法，把读到的文件保存到服务器的硬盘上
        8、使用Socket对象的getOutputStream(),获取网络字节输出流对象
        9、使用网络字节输出流对象的write()方法，回写给客户端"上传成功"
        10、释放资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1、创建一个服务器SocketServer对象，和系统要制定的端口号
        ServerSocket ss = new ServerSocket(8888);
        /*
            优化2：
            使用死循环让服务器一直处于监听状态，有一个客户端上传文件，就保存一个文件
         */
        while(true) {
            Socket socket = ss.accept();
            /*
                优化3：
                进一步提高效率，使用多线程处理多个客户端套接字的请求
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 提升变量的作用域
                    FileOutputStream fos = null;
                    try{
                        //3、使用Socket对象的getInputStream()，获取网络字节输入流对象
                        InputStream is = socket.getInputStream();
                        //4、判断/Users/yanzhang/Desktop/upload是否存在，不存在即创建目录
                        File file = new File("/Users/yanzhuang/Desktop/upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                    /*
                        优化1：
                        自定义一个命名规则，防止同名的文件被覆盖
                        规则：域名 + 毫秒值 + 随机数
                     */
                        String fileName = "zx" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
                        //5、创建一个本地字节输出流FileOutputStream对象，构造方法中绑定需要输出的目的地
                        fos = new FileOutputStream(file+"/" + fileName);
                        //6、使用网络字节输入流对象的read()方法，读取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes)) != -1) {
                            //7、使用本地字节输出流对象的write()方法，把读到的文件保存到服务器的硬盘上
                            fos.write(bytes,0,len);
                        }
                        //8、使用Socket对象的getOutputStream(),获取网络字节输出流对象
                        OutputStream os = socket.getOutputStream();
                        //9、使用网络字节输出流对象的write()方法，回写给客户端"上传成功"
                        os.write("上传成功".getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        //10、释放资源
                        try {
                            fos.close();
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        // 服务器需要一直处于启动状态，进行监听
        //ss.close();
    }
}
