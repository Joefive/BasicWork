package com.sunrise.day19;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP/IP面向连接的通讯，三次握手：
 * 1.客户端向服务器发起请求，等待服务器确认；
 * 2.服务器端向客户端返回一个响应，通知客户端受到了连接请求；
 * 3.客户端再次向服务器端发送请求，确认连接信息；
 * UDP无连接通讯：数据发送出去不知道对方是否接收到。
 * Socket类：套接字：IP加端口号的网络单位
 * 构造方法：Socket(String host,int port)方法
 * 成员方法：OutputStream(),getOutputStream(),
 * InputStream(),getInputStream(),close()方法；
 * 使用步骤：1.构造Socket对象；
 * 2.使用getOutputStream()方法创建OutputStream对象；
 * 3.调用OutputStream的write()方法进行写入给服务器发送消息；
 * 4.使用getInputStream()方法创建InputStream对象；
 * 5.调用InputStream对象read()方法进行读取客户端信息；
 * 6.释放socket资源，调用close()方法。
 */

public class Demo01TcpClient {
    public static void main(String[] args) throws IOException {
        //1.构造Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);
        //2.使用getOutputStream构造输出字节流对象
        OutputStream os = socket.getOutputStream();
        //3.使用字节输出流对象write()方法，向服务器端发送信息
        os.write("你好服务器！".getBytes());
        //4.使用getInputStream()方法构造字节输入流对象来接受服务器端回传信息
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}
