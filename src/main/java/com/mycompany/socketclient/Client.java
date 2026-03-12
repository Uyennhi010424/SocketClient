package com.mycompany.socketclient;

import java.io.*;
import java.net.Socket;

public class Client {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String username;

    public void connect(String server, int port, String username) {
        try {

            socket = new Socket(server, port);

            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(
                    socket.getOutputStream(), true);

            out.println(username);

            this.username = username;

            System.out.println("Connected to server");

        } catch (Exception e) {
            System.out.println("Không kết nối được server!");
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg) {
        if (out != null) {
            out.println(msg);
        } else {
            System.out.println("Chưa kết nối tới server!");
        }
    }

    public BufferedReader getReader() {
        return in;
    }
}
