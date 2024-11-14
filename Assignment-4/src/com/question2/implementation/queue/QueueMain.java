package com.question2.implementation.queue;

public class QueueMain {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30); 
		queue.display();
		// Output: 10 -> 20 -> 30 -> null 
		System.out.println(queue.dequeue()); 
		// Output: 10
		queue.display();
		// Output: 20 -> 30 -> null 
		System.out.println(queue.peek());
		// Output: 20
	}
}
