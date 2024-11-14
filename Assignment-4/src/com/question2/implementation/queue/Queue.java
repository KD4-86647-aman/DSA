package com.question2.implementation.queue;

public class Queue {
	static class Node{
		int data;
		Node next;
		public Node(int value) {
			this.data=value;
			this.next=null;
		}
	}
	Node front,rear;
	public Queue() {
		this.front=this.rear=null;
	}
	public void enqueue(int value) {
		Node newNode=new Node(value);
		if(this.rear==null && this.front==null) {
			this.front=this.rear=newNode;
			return;
		}else {
			this.rear.next=newNode;
			this.rear=newNode;
		}
	}
	public int dequeue() {
		if(this.front==null) {
			System.out.println("Queue is empty!");
			return -1;
		}else {
			int poppedData=this.front.data;
			this.front=this.front.next;
			return poppedData;
		}
	}
	public boolean isEmpty() {
		return this.front==null;
	}
	public int peek() {
		if(this.front==null) {
			System.out.println("Queue is empty !");
			return -1;
		}
		return this.front.data;
	}
	public void display() {
		if(this.front==null) {
			System.out.println("Queue is empty !");
		}else {
			Node trav=this.front;
			while(trav!=null) {
				System.out.print(trav.data+" --> ");
				trav=trav.next;
			}
			System.out.println("null");
		}
	}
	
}
