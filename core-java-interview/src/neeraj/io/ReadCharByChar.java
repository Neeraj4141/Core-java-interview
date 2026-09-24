package neeraj.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCharByChar {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("D:\\Hibernate Jars");
		FileWriter wfile = new FileWriter("D:\\Rays PDF");

		int ch = file.read();

		while (ch != -1) {

			System.out.println((char) ch);

			wfile.write(ch);
			ch = file.read();

		}
		wfile.close();
		file.close();
	}

}
