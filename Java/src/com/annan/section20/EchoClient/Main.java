package com.annan.section20.EchoClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Socket clientSocket = new Socket("localhost", 5000)) {
            clientSocket.setSoTimeout(5000);
            BufferedReader echos = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(clientSocket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;
            do {
                System.out.println("Enter String to be echoed");
                echoString = scanner.nextLine();
                stringToEcho.println(echoString);
                if (!echoString.equals("exit")) {
                    response = echos.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));

        } catch (SocketTimeoutException e) {
            System.out.println("Socket Timed Out");
        } catch (IOException e) {
            System.out.println("Client Exception: " + e.getMessage());
        }
    }
}
