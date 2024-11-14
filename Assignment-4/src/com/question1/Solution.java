package com.question1;

public class Solution {
	
	public static void main(String[] args) {
		SinglyCircularLinkedListWithoutHead sCLLWH=new SinglyCircularLinkedListWithoutHead();
		sCLLWH.addFirst(1);
		sCLLWH.displayAll();
		sCLLWH.addFirst(2);
		sCLLWH.displayAll();
		sCLLWH.addFirst(3);
		sCLLWH.displayAll();
		sCLLWH.addFirst(4);
		sCLLWH.displayAll();
		sCLLWH.addFirst(5);
		sCLLWH.displayAll();
		
		sCLLWH.addLast(5);
		sCLLWH.displayAll();
		sCLLWH.addLast(6);
		sCLLWH.displayAll();
		sCLLWH.addLast(7);
		sCLLWH.displayAll();
		sCLLWH.addLast(8);
		sCLLWH.displayAll();
		sCLLWH.addLast(9);
		sCLLWH.displayAll();
		
		sCLLWH.addPosition(11, 5);
		sCLLWH.displayAll();
		sCLLWH.addPosition(15, 5);
		sCLLWH.displayAll();
		sCLLWH.addPosition(17, 5);
		sCLLWH.displayAll();
		sCLLWH.addPosition(19, 5);
		sCLLWH.displayAll();
		
		sCLLWH.deleteFirst();
		sCLLWH.displayAll();
		sCLLWH.deleteFirst();
		sCLLWH.displayAll();
		sCLLWH.deleteFirst();
		sCLLWH.displayAll();
		sCLLWH.deleteFirst();
		sCLLWH.displayAll();
		
		sCLLWH.deleteLast();
		sCLLWH.displayAll();
		sCLLWH.deleteLast();
		sCLLWH.displayAll();
		sCLLWH.deleteLast();
		sCLLWH.displayAll();
		sCLLWH.deleteLast();
		sCLLWH.displayAll();
		
		
		sCLLWH.deletePosition(5);
		sCLLWH.displayAll();
		sCLLWH.deletePosition(5);
		sCLLWH.displayAll();
		sCLLWH.deletePosition(5);
		sCLLWH.displayAll();
		sCLLWH.deletePosition(5);
		sCLLWH.displayAll();
		sCLLWH.deletePosition(5);
		sCLLWH.displayAll();
		
		
		
	}
}
