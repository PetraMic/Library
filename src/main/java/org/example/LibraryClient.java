package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class LibraryClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader fromServerReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter toServerWriter = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String inputText;

            do {
                System.out.println("Enter string to send");
                inputText = scanner.nextLine();

                if (!inputText.equals("exit")) {
                    toServerWriter.println(inputText);
                    String fromServerMessage = fromServerReader.readLine();
                    System.out.println(fromServerMessage);
                }
            } while (!inputText.equals("exit"));
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
