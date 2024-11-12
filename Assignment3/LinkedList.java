package com.sunbeam;



public class LinkedList {
       
	static class Node{
		private int data;
		Node next;
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	 
	
	public void addAftergivenData(int value,int given) {
	   	 if (head == null) {		         
		        return;
		    }		   
		    Node trav = head;
		    while (trav != null && trav.data != given) {
		        trav = trav.next;
		    }		    
		    if (trav == null) {
		        System.out.println("not found");
		        return;
		    }		    
		    Node newNode = new Node(value);		    
		    newNode.next = trav.next;
		    trav.next = newNode;
	}
	
	public void addBeforeGiveData(int given,int value) {
	 
	    if (head == null) {
	        
	        return;
	    }
 
	    if (head.data == value) {
	        Node newNode = new Node(given);
	        newNode.next = head;
	        head = newNode;
	        return;
	    }	    
	    Node trav = head;
	    Node trav1 = null;

	    while (trav != null && trav.data != value) {
	        trav1 = trav;
	        trav = trav.next;
	    }	     
	    if (trav == null) {
	        System.out.println("Value not found in the list.");
	        return;
	    }
	    Node newNode = new Node(given);
	    trav1.next = newNode;
	    newNode.next = trav;
		
	}
	
	public void addLast(int value) {
		  Node newNode=new Node(value);
		  
		   if(isEmpty()) {
			    head=newNode;
		   }else {
			   Node trav=head;
			   while(trav.next!=null) {
				   trav=trav.next;
			   }
			   trav.next=newNode;
		   }
	}
	
	
	
	public void display() {
		Node trav=head;
		
		while(trav!=null) {
			System.out.print(trav.data+"->");
			trav=trav.next;
		}
	}
}

