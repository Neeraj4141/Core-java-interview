package neeraj.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutCatchResources {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileReader reader = new FileReader("src/neeraj/exception/Account.java")) {
			System.out.println(reader.read());
		}
	}
}