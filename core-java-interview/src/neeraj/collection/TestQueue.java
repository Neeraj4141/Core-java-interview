package neeraj.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);

		q.add(200);
		q.add(300);
		q.add(400);
		q.offer(100);

		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.contains(100));
		System.out.println(q);
	}

}
