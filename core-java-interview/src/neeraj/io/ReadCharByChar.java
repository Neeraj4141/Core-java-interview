package neeraj.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCharByChar {

	public static void main(String[] args) throws IOException  {

		// Source file
		FileReader file = new FileReader("D:\\io\\Keyboard.txt");

		// Destination file
		// Agar Copy.txt nahi hai to FileWriter khud create kar dega
		FileWriter wfile = new FileWriter("D:\\io\\Copy.txt");

		// Pehla character read
		int ch = file.read();

		// Jab tak file ka end nahi aata
		while (ch != -1) {

			// Character console par print
			System.out.println((char) ch);

			// Character ko destination file mein write
			wfile.write(ch);

			// Next character read
			ch = file.read();
		}

		// Files close
		wfile.close();
		file.close();

		System.out.println("File copied successfully.");
	}
}
