package lesson6.server;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    private static final int SERVER_PORT = 8189;
    private static Object Scanner;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
                System.out.println("Ожидание подключения...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Соединение установлено!");

//            Scanner in = new Scanner(clientSocket.getInputStream());
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());


                while (true) {
                    String message = in.readUTF();
                    System.out.println("Сообщение пользователя: " + message);

                    if (message.equals("/exit")) {
                        break;
                    }

                    out.writeUTF(message.toUpperCase());
                }

                System.out.println("Сервер остановлен");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Порт уже занят");
            }
        });

        thread.start();

        Thread thread1 = new Thread(() -> {

            while (true) {Scanner sc = new Scanner(System.in);
//            System.out.println("Введите сообщение:");

            String messageFromServer = sc.nextLine();;

            System.out.println("Сервер: " + messageFromServer);}

        });
        thread1.start();




/*        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Ожидание подключения...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Соединение установлено!");

//            Scanner in = new Scanner(clientSocket.getInputStream());
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());


            while (true) {
                String message = in.readUTF();
                System.out.println("Сообщение пользователя: " + message);

                if (message.equals("/exit")) {
                    break;
                }

                out.writeUTF(message.toUpperCase());
            }

            System.out.println("Сервер остановлен");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Порт уже занят");
        }*/


    }

}
