import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("200.239.180.190",12343);
		System.out.println("O cliente se conectou ao servidor!");
		
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(client.getOutputStream());
		
		String str = "";
 		while(str != "EXIT") {
			str = sc.nextLine();
			
			out.print(str);
			out.println();
		}
		
		out.close();
	    sc.close();
	    client.close();

	}

}
