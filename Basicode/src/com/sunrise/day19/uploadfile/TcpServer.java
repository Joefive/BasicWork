package com.sunrise.day19.uploadfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 本地数据上传至服务器：E:\\test\\inner文件夹中
 * 1.客户端本地读取文件需要使用自己创建字节流(本第流)；
 * 2.客户端和服务器交互需要使用Socket提供的字节流（网络流）;
 * 原理实际是文件的复制
 */

public class TcpServer {
    public static void main(String[] args) throws IOException {
        //1.构造服务器ServerSocket对象，制定客户端端口
        ServerSocket server = new ServerSocket(6666);
        //2.使用ServerSocket对象中accept()方法来获取客户端Socket对象
        Socket socket = server.accept();
        //3.调用Socket对象中的getInputStream()方法，构造字节输入流，来获取网络字节输入流
        InputStream is = socket.getInputStream();
        //4.判断是否存在E:\\test\\inner文件夹
        File file = new File("D:\\");
        if (!file.exists()) {
            file.mkdir();
        }
        //5.构造服务器端FileOutputStream，构造器中包含输出文件夹
        FileOutputStream fos = new FileOutputStream(file + "\\timg.jpg");
        System.out.println("111111111111111");
        //6.调用InputSteam对象read()方法，读取客户端上传文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            //7.构造服务器端FileInputSteam对象，调用write()，将文件读取到服务器硬盘
            fos.write(bytes, 0, len);
        }
        System.out.println("222222222222222");
        //8.调用Socket对象中getOutputStream方法，构造OutputStream对象
        //9.使用OutputStream对象中write()方法回写返回客户端数据
        socket.getOutputStream().write("上传成功".getBytes());
        //10.释放资源；
        fos.close();
        socket.close();
        server.close();


    }
}
