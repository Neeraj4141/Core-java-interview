package neeraj.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>();

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
