package com.sunbeam;



import java.util.Scanner;

public class LinkedListTester {
       public static void main(String[] args) {
    	   
    	LinkedList list=new LinkedList();
    	list.addLast(10);
    	list.addLast(20);
    	list.addLast(30);
    	list.addLast(40);
    	list.addLast(50);
		Scanner sc=new Scanner(System.in);
		int choice;
		int value;
		int given;
		list.display();
		do {
			System.out.println();
			System.out.println("1. Add after given data\n2. Add before given data\n3. Exit\n\nEnter your choice :");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				   System.out.print("Enter value :");			   
				   value=sc.nextInt();
				   System.out.print("Enter data to insert value after it :");
				   given=sc.nextInt();
				   list.addAftergivenData(given, value);	   
				   break;
			case 2:
				 System.out.print("Enter value :");
				   value=sc.nextInt();
				   System.out.print("Enter data to insert value before it :");
				   given=sc.nextInt();
				    list.addBeforeGiveData(given, value);
				   break;
			}
	        list.display();
			
		}while(choice!=3);
	}
}

