import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 6789);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите сообщение для сервера:");
            String sentence = inFromUser.readLine();
            outToServer.writeBytes(sentence + '\n');

            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String modifiedSentence = inFromServer.readLine();
            System.out.println("Ответ от сервера: " + modifiedSentence);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
