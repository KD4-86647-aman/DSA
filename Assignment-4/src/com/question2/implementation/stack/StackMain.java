package com.question2.implementation.stack;

public class StackMain {
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push(0);
		stack.display();
		stack.push(1);
		stack.display();
		stack.push(2);
		stack.display();
		stack.push(3);
		stack.display();
		stack.push(4);
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		
	}
}
