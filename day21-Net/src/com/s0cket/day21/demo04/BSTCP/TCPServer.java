package com.s0cket.day21.demo04.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建BS版本的TCP服务器
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器SocketServer对象，和系统要制定的端口号
        ServerSocket ss = new ServerSocket(8080);
        /*
            浏览器解析服务器回写的html页面，如果页面中有图片，那么浏览器就会单独的开一个线程，读取服务器的图片
            我们就让服务器一直处在监听状态，客户端请求一次，服务器就回写一次
         */
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        //使用SocketServer对象中的accept方法，获取请求的客户端socket对象（浏览器）
                        Socket socket = ss.accept();
                        //使用Socket对象的getInputStream()，获取网络字节输入流对象
                        InputStream is = socket.getInputStream();

                        //把is网络字节输入流转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求信息的第一行读取出来
                        String line = br.readLine();
                        //对字符串进行切割，获取需要的部分
                        String[] arr = line.split(" ");
                        //把前面的路径/ 去掉，截取
                        String htmlPath = arr[1].substring(1);

                        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
                        FileInputStream fis = new FileInputStream(htmlPath);
                        //使用Socket中的方法getOutputStream获取网络字节输出流
                        OutputStream os = socket.getOutputStream();
                        //写入HTTP协议的响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());

                        //一读一写复制文件，把服务器读取的html文件回写到客户端（网页）
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1){
                            os.write(bytes, 0, len);
                        }

                        //释放资源
                        fis.close();
                        socket.close();
                        ss.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
