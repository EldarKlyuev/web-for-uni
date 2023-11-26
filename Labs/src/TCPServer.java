import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6789);
            System.out.println("Сервер запущен. Ожидание подключения клиента...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился.");

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(clientSocket.getOutputStream());

            String clientMessage = inFromClient.readLine();
            System.out.println("Получено от клиента: " + clientMessage);

            String capitalizedMessage = clientMessage.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedMessage);

            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
