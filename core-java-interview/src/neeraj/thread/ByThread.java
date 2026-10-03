package neeraj.thread;

public class ByThread extends Thread {

	String name = null;

	public ByThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " = " + name);
		}
	}

}
