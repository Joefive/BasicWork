package com.sunrise.day19;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端：ServerSocket类
 * 构造器：Server(int port)
 * 成员方法：accept()，获取请求客户端的Socket方法
 * 步骤：1.构造ServerSocket类，制定获取客户端的端口号；
 * 2.使用accept()方法获取Socket对象；
 * 3.调用Socket对象中的getInputStream()方法获取InputStream对象；
 * 4.调用InputStream中read()方法进行读取信息；
 * 5.调用Socket对象中的getOutStream()方法获取OutStream对象；
 * 6.调用OutputStream中write()方法进行回写资源；
 * 7.释放Socket，ServerSocket对象资源close()方法。
 */

public class Demo02TcpServer {
    public static void main(String[] args) throws IOException {
        //1.获取服务器端对象
        ServerSocket server = new ServerSocket(8888);
        //2.使用accept()方法获取客户端socket对象
        Socket socket = server.accept();
        //3.使用socket对象中的getInputStream()方法获取输入字节流
        InputStream is = socket.getInputStream();
        //4.使用read()方法进行读取客户端发送数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5.使用getOutputStream()获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        //6.使用输出字节流，发送给客户端信息
        os.write("已经收到".getBytes());
        socket.close();
        server.close();


    }
}
