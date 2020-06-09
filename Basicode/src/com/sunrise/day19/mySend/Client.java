package com.sunrise.day19.mySend;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 1.客户端OUTPUT--->服务端INPUT
 * 2.服务端OUTPUT--->客户端INPUT
 */

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("NOTE:Client is already Now !!!");
        Socket socket = new Socket("127.0.0.1", 6688);
        OutputStream os = socket.getOutputStream();
        os.write("Client：你好，TCP/IP,我来了！".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}
