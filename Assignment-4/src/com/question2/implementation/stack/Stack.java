package com.question2.implementation.stack;


public class Stack {
	static class Node{
		int data;
		Node next;
		public Node(int value) {
			this.data=value;
			this.next=null;
		}	
	}
	private Node top;
	public Stack() {
		top=null;
	}
	public void push(int value) {
	
		Node newNode=new Node(value);
		newNode.next=top;
		top=newNode;
	}
	public int pop() {
		if(top==null) {
			System.out.println("Stack is empty !");
			return -1;
		}
		int poppedData=top.data;
		top=top.next;
		return poppedData;
	}
	public int peek() {
		if(top==null) {
			return -1;
		}
		return top.data;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void display() {
		if(top==null) {
			System.out.println("Stack is empty.");
		}else {
			Node trav=top;
			while(trav!=null) {
				System.out.print(trav.data+" --> ");
				trav=trav.next;
			}
			System.out.println("null");
		}
	}
	
}
