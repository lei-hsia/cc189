
// Java Collection framwework provides a Stack class which models
// and implemtns Stack DS

// Class supports 1 default constructor Stack() which is used to 
// create an empty stack

/*
java.lang.Object
	java.util.AbstractCollection<E>
		java.util.AbstractList<E>
			  java.util.Vector<E>
					java.util.Stack<E>
*/

// Java code for stack: from geekforgeeks.com
import java.io.*;
import java.util.*;

class Test_stack_builtin{

	static void stack_push(Stack<Integer> stack){

		for (int i=0; i<5; i++){
			stack.push(i);
		}
	}

	static void stack_pop(Stack<Integer> stack){

		System.out.println("Pop: ");

		for (int i=0; i<5; i++){
			Integer y = stack.pop();
			System.out.println(y);
		}
	}

	static void stack_peek(Stack<Integer> stack){
		Integer element = stack.peek();
		System.out.println("Element on stack top: "+element);
	}

	// search element in stack, search is built-in
	static void stack_search(Stack<Integer> stack, int element){
		Integer pos = (Integer) stack.search(element);

		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position "+pos);
		
	}

	public static void main(String[] args){

		// default constructor: public Stack();
		Stack<Integer> stack1 = new Stack<Integer>();
		stack_push(stack1);
		stack_pop(stack1);
		stack_push(stack1);
		stack_peek(stack1);
		stack_search(stack1, 2);
		stack_search(stack1, 6);
	}

}