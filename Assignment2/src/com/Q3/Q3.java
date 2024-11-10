package com.Q3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. EXIT");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
				System.out.println("Enter Element TO add in Queue : ");
				int x = sc.nextInt();
				q.push(x);
				}
				break;
				
			case 2: 
				if(q.isFull())
					System.out.println("Queue is full");
				else {
				System.out.println("Element Removed From Queue : "+q.pop()); 
				}
				break;
				
			case 3:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
				System.out.println("Element At Front : "+q.peek()); 
				}
				break;
				
			default:
				System.out.println("Enter Correct Choice!!!");
				break;
			}
			
		}while(choice !=0);
		sc.close();

	}

}
