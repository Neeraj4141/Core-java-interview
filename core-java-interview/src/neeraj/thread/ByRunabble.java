package neeraj.thread;

public class ByRunabble implements Runnable {

	String name = null;

	public ByRunabble(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + name);
		}

	}

}
