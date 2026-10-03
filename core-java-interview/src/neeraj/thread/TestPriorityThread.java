package neeraj.thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PiorityThread t1 = new PiorityThread("Neeraj");
		PiorityThread t2 = new PiorityThread("Mewada");

		t1.setPriority(1);
		t2.setPriority(10);
		
		// t1.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

	}

}
