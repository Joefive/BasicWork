package com.sunrise.day19.uploadfile;

import java.io.*;
import java.net.Socket;

/**
 * 本地文件复制到服务器端
 * public int read(byte[] b) throws IOException
 * 从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用
 */

public class TcpClient {
    public static void main(String[] args) throws IOException {
        //1.本地创建字节输入流，构造器中制定需要上传文件
        FileInputStream fis = new FileInputStream("E:\\test\\timg.jpg");
        //2.构造本地Socket对象，制定IP与端口
        Socket socket = new Socket("127.0.0.1", 6666);
        //3.调用socket对象getOutputStream()方法获取OutputStream对象
        OutputStream os = socket.getOutputStream();
        //4.调用fis来读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read()) != -1) {
        //5.调用OutputStream对象中方法write()，写入到服务器中
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput(); //【结束当前循环，不会进入阻塞状态】
        //6.读取服务器回写的数据，使用socket方法getInputStream()构造回写流并读取数据
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //7.释放资源
        fis.close();
        socket.close();


    }
}
