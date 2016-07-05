import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12343);
		System.out.println("Porta 12345 aberta!");

		Socket client = server.accept();
		System.out.println("Nova conexão com o cliente " + 
		  client.getInetAddress().getHostAddress()
		); // imprime o ip do cliente
		
		Scanner sc = new Scanner(client.getInputStream());

		String str = "";
		while (str != "EXIT") {
			str = sc.nextLine();
			System.out.println(str);
		}
		
		sc.close();
		client.close();
		server.close();
	}

}
