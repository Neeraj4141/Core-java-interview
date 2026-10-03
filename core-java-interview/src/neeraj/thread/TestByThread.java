package neeraj.thread;

public class TestByThread {

	public static void main(String[] args) {

		ByThread t1 = new ByThread("Neeraj");
		ByThread t2 = new ByThread("Mewada");

		t1.start();
		t2.start();
	}

}
