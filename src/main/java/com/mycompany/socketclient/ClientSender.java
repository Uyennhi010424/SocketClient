package com.mycompany.socketclient;

import java.io.PrintWriter;
import java.util.Scanner;

public class ClientSender extends Thread {

    private PrintWriter out;

    public ClientSender(PrintWriter out) {
        this.out = out;
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String message = scanner.nextLine();
            out.println(message);

        }
    }
}