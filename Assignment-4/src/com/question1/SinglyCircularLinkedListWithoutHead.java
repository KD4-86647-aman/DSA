package com.question1;

public class SinglyCircularLinkedListWithoutHead {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	private Node tail;
	private int size;
	public SinglyCircularLinkedListWithoutHead() {
		tail=null;
		size=0;
	}
	public void displayAll() {
		if(isEmpty()) {
			return;
		}
		Node trav=tail.next;
		while(trav!=tail) {
			System.out.print(trav.data+" --> ");
			trav=trav.next;
		}
		System.out.print(trav.data+" --> ");
		System.out.println();
		
	}
	public void deleteAll() {
		tail=null;
	}
	public void addFirst(int value){
		Node newNode=new Node(value);
		if(isEmpty()) {
			tail=newNode;
			tail.next=tail;
		}else {
			newNode.next=tail.next;
			tail.next=newNode;
		}
		size++;
	}
	public void addLast(int value) {
		Node newNode=new Node(value);
		if(isEmpty()) {
			tail=newNode;
			tail.next=tail;
		}else {
			newNode.next=tail.next;
			tail.next=newNode;
			tail=newNode;
		}
		size++;
	}
	public void addPosition(int value,int pos) {
		if(pos<1 || pos>size+1) {
		System.out.println("Invalid position");
			return;
		}
		Node newNode=new Node(value);
		if(size==0) {
			tail=newNode;
			tail.next=tail;
		}else if(pos==1) {
			addFirst(value);
		}else if(pos==size+1) {
			addLast(value);
		}else {
			Node trav=tail;
			for(int i=1;i<pos;i++) {
				trav=trav.next;
			}
			newNode.next=trav.next;
			trav.next=newNode;
			
		}
		size++;
	}
	public void deleteFirst(){
		if(isEmpty()) {
		return;
		}else if(size==1)
		{
			tail=null;
		}
		else {
			tail.next=tail.next.next;
		}
		size--;
	}
	public void deleteLast() {
		if(isEmpty()) {
			return;
			}
		else if(size==1)
		{
			tail=null;
		}
		else {
			Node trav=tail;
			while(trav.next!=tail) {
				trav=trav.next;
			}
			trav.next=tail.next;
			tail=trav;
		}
		size--;
		
	}
	public void deletePosition(int pos) {
		System.out.println(pos);
		if(pos<1 || pos>size+1) {
		System.out.println("Invalid position");
			return;
		}
		 if(pos==1) {
			deleteFirst();
		}else if(pos==size+1) {
			deleteLast();
		}else {
			Node trav=tail;
			for(int i=1;i<pos;i++) {
				trav=trav.next;
			}
			System.out.println(trav.data);
			trav.next=trav.next.next;
		}
		size--;
	}
	public boolean isEmpty() {
		return tail==null;
	}
}
