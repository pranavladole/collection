package com.pranav.sample;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		System.out.println("stack");
		Stack<String> animal = new Stack();
		animal.push("ant");
		animal.push("lion");
		animal.push("zebra");
		animal.push("cat");
		System.out.println("stack"+animal);
		System.out.println(animal.peek());
		
		System.out.println(animal.pop());
		System.out.println(animal);
	}

}
