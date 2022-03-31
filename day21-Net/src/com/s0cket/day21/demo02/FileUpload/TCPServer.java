package com.s0cket.day21.demo02.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
        //2、使用SocketServer对象中的accept方法，获取请求的客户端socket对象
        Socket socket = ss.accept();
        //3、使用Socket对象的getInputStream()，获取网络字节输入流对象
        InputStream is = socket.getInputStream();
        //4、判断/Users/yanzhang/Desktop/upload是否存在，不存在即创建目录
        File file = new File("/Users/yanzhuang/Desktop/upload");
        if(!file.exists()){
            file.mkdirs();
        }
        //5、创建一个本地字节输出流FileOutputStream对象，构造方法中绑定需要输出的目的地
        FileOutputStream fos = new FileOutputStream(file+"/a.jpg");
        //6、使用网络字节输入流对象的read()方法，读取客户端上传的文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
            //7、使用本地字节输出流对象的write()方法，把读到的文件保存到服务器的硬盘上
            fos.write(bytes,0,len);
        }
        //8、使用Socket对象的getOutputStream(),获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        //9、使用网络字节输出流对象的write()方法，回写给客户端"上传成功"
        os.write("上传成功".getBytes());
        //10、释放资源
        fos.close();
        socket.close();
        ss.close();
    }
}
