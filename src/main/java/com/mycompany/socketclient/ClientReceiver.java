package com.mycompany.socketclient;

import java.io.BufferedReader;

public class ClientReceiver extends Thread {

    private BufferedReader in;

    public ClientReceiver(BufferedReader in) {
        this.in = in;
    }

    public void run() {

        try {

            String message;

            while ((message = in.readLine()) != null) {

                System.out.println(message);

            }

        } catch (Exception e) {

            System.out.println("Mất kết nối server");

        }
    }
}