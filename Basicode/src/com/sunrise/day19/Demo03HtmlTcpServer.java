package com.sunrise.day19;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 让浏览器来充当客户端来访问服务器端
 * http://127.0.0.1:6688/Basicode/src/com/sunrise/day19/web/index.html
 */

public class Demo03HtmlTcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6688);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        /*byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/
        //需要把字符输入流转换成字符缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把请求中的第一行进行读取出来
        String line = br.readLine();
        //将第一行信息使用split方法按照空格进行分割
        String[] arr = line.split(" ");
        //将字符串数组中下标1的部门去除，并使用substring方法截取调开头的/
        String htmlpath = arr[1].substring(1);
        //创建本地字节输入流，构造器中绑定HTML读取的路径
        FileInputStream fis = new FileInputStream(htmlpath);
        //读取完成后需要获取输出流，使用socket中getOutputStream()方法进行获取
        OutputStream os = socket.getOutputStream();

        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());

        //一读一写
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //关闭资源
        fis.close();
        socket.close();
        server.close();

    }
}
