package neeraj.io.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Employee e = new Employee(1, "Neeraj");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://io//employee.txt"));

		out.writeObject(e);

		out.close();

		System.out.println("ObjectSerializable Successfull");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://io//employee.txt"));

		System.out.println(in.readObject());

		in.close();

	}

}
