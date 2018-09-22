
// public class EmptyStackException extends RuntimeException{
// 	public EmptyStackException(String err){
// 		super(err);
// 	}
// }

// sample of implementting a stack on Cracking Coding Interview
public class MyStack_CCI<T>{
/*
	< > : Generics, this enables types(classes, interfaces) to be
	parameters when defining classes, interfaces and methods
	choices in <>: 
	T: Type
	E: Element
	K: Key
	N: Number
	V: Value
*/
	// static class StackNode: shared by all other methods in 
	// class MyStack_CCI. 
	//其实这里跟定义linkedlist的node是相同的，每一个node都是含有一个
	// data和指向下一个node的link, 只不过data的数据类型是generic T
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;

		public StackNode(T data){
			this.data = data;
		}
	}

	private StackNode<T> top;

	// return value of type T (generic variable)
	public T pop(){
		if (top == null) throw new RuntimeException("empty stack!");
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item){
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}

	public T peek(){
		if (top == null) throw new RuntimeException("empty stack");
		return top.data;
	}

	public boolean isEmpty(){
		return top == null;
	}

	public static void main(String[] args){
		MyStack_CCI stack = new MyStack_CCI();
		stack.push(1);
		
	}




}