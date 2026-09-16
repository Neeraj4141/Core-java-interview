package neeraj.collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(null);
		s.push(null);
		s.push('q');
		s.push(1.55);

		System.out.println(s); // Stack ka pura data
		System.out.println(s.peek()); // Top element ko sirf dekhta hai
		System.out.println(s); // Data same rahega
		System.out.println(s.pop()); // Top element ko remove karke return karta hai
		System.out.println(s); // Remove hone ke baad ka Stack

	}

}
