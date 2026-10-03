package neeraj.thread;

public class TestRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRunabble("Neeraj"));
		Thread t2 = new Thread(new ByRunabble("Mewada"));

		t1.start();
		t2.start();
	}

}
