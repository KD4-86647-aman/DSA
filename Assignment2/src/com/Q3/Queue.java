package com.Q3;

public class Queue {
	
	int arr[];
	int front,rear;
	final int size;

	public Queue(int Size) {
		
		size = Size;
		arr = new int[size];
		front = rear = 0;
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;

	}
	
	public int pop() {
		
		int temp = arr[front];
		front++;
		return temp;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	

}
