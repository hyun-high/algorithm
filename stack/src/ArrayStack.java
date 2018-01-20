package stack;

import java.util.Scanner;

class Stack_Array {

	private int top;
	private int maxSize = 10000;
	private Object[] stackArray;
	
	public Stack_Array() {
		this.top = -1;
		this.stackArray = new Object[maxSize];
	}
	
	public int isEmpty() {
		return (top == -1 ? 1 : 0);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public void push(Object item) {
		if(isFull()) System.out.println("the stack is full");
	
		stackArray[++top] = item;
	}
	
	public Object pop() {
		if(isEmpty() == 1) return -1;

		Object item = peek();
		top--;
		return item;
	}
	
	public Object peek() {
		if(isEmpty() == 1) return -1;
		return stackArray[top];
	}
	
	public int size() {
		return top + 1;
	}
}

public class ArrayStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int stackNum = 0;
		
		System.out.print("Enter the instruction numbers: ");
		stackNum = Integer.parseInt(scan.nextLine());
		
		Stack_Array stack = new Stack_Array();
		
		for(int i = 1; i <= stackNum; i++) {
			String input = scan.nextLine();
			String[] inputs = input.split(" ");
			
			switch(inputs[0]) {
			case "push":	stack.push(inputs[1]);					break;
			case "pop":		System.out.println(stack.pop());		break;
			case "top":		System.out.println(stack.peek());		break;
			case "size":	System.out.println(stack.size());		break;
			case "empty":	System.out.println(stack.isEmpty());	break;
			}
		}
	}
}
