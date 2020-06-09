package com.sunrise.day19.mySend;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Note：Server is already Now ,please send a Message!!!");
        ServerSocket server = new ServerSocket(6688);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        OutputStream os = socket.getOutputStream();
        os.write("Server：欢迎来来到TCP/IP世界！".getBytes());
        socket.close();
        server.close();

    }
}
