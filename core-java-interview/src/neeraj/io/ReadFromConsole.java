package neeraj.io;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		String lName = "Mewada";

		Scanner sc = new Scanner(System.in);

		while (true) {
			String name = sc.nextLine();
			System.out.println(name + lName);
		}
	}

}
