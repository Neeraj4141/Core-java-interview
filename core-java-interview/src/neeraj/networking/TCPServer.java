package neeraj.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(1234);

		System.out.println("server wait for client");

		Socket client = server.accept();
		System.out.println("client connection");

		DataInputStream in = new DataInputStream(client.getInputStream());

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hello clients");

		String s = in.readLine();

		System.out.println(s);

		server.close();
		client.close();

	}

}
