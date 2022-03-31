package com.s0cket.day21.demo02.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    文件上传案例客户端：读取本地文件，上传到服务器，读取服务器回写的数据

    明确：
        数据源：/Users/yanzhuang/Desktop/3.jpg
        目的地：服务器
    实现步骤：
        1、创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        2、创建一个客户端Socket对象，绑定服务器的IP地址和端口号
        3、使用Socket中的方法getOutputStream()获取网络字节输出流对象
        4、使用本地字节输入流对象中的read()，读取本地文件
        5、使用网络字节输出流对象中的write()，把读取的文件上传到服务器
        6、使用Socket中的方法getInputStream,获取网络字节输入流对象
        7、使用网络字节输入流对象中的read()读取服务器回写的数据
        8、释放资源
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1、创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("/Users/yanzhuang/Desktop/3.jpg");
        //2、创建一个客户端Socket对象，绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //3、使用Socket中的方法getOutputStream()获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        //4、使用本地字节输入流对象中的read()，读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            //5、使用网络字节输出流对象中的write()，把读取的文件上传到服务器
            // 结束标记不会传到服务器中,服务器会陷入死循环
            os.write(bytes);
        }
        /*
            public void shutdownOutput() throws IOException
            使用socket的shutdownOutput方法结束输入流，将结束标记发送给服务器
         */
        socket.shutdownOutput();
        //6、使用Socket中的方法getInputStream,获取网络字节输入流对象
        InputStream is = socket.getInputStream();
        //7、使用网络字节输入流对象中的read()读取服务器回写的数据
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        //8、释放资源
        fis.close();
        socket.close();
    }
}
