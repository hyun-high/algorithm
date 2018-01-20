package stack;

import java.util.Scanner;

class LinkedStack {

	private Node top;
	
	private class Node {
		private Object data;
		private Node nextNode;
		
		Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
	}
	
	public LinkedStack() {
		this.top = null;
	}
	
	public int isEmpty() {
		return (top == null ? 1 : 0);
	}
	
	//del - public boolean isFull() {}
	
	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.nextNode = top;
		top = newNode;
	}
	
	public Object pop() {
//		if(isEmpty() == 1) throw new ArrayIndexOutOfBoundsException();
		if(isEmpty() == 1) return -1;
		Object item = peek();
		top = top.nextNode;
		return item;
	}
	
	public Object peek() {
		if(isEmpty() == 1) return -1;
		
		return top.data;
	}
	
	public int size() {
		Node ptr = top;
		int count = 0;
		for(;ptr != null; count++, ptr=ptr.nextNode);
		
		return count;
	}
}
	
public class LinkedListStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int stackNum = 0;
		
		System.out.print("Enter the instruction numbers: ");
		stackNum = scan.nextInt();
		
		LinkedStack stack = new LinkedStack();
		
		for(int i = 0; i < 30; i++) {
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


