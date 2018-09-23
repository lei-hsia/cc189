

// detailed implementation of a queue
public class MyQueue_CCI<T>{

	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;

		public QueueNode(T data){
			this.data = data;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item){
		QueueNode<T> t = new QueueNode<T>(item);
		if (last != null){
			last.next = t;
		}
		last = t;  // update the node last is pointing to

		if (first == null)
			first = last;  // first,last,t all point to the same node
	}

	public T remove(){
		if (first == null) throw new NoSuchElementException();
		T data = first.data;
		first = first.next;
		if (first == null){
			last = null;
		}
		return data;
	}

	public T peek(){
		if (first == null) throw new NoSuchElementException();
		return first.data;
	}

	public boolean isEmpty(){
		return first == null;
	}
}