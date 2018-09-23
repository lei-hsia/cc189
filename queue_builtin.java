

// queue is a built-in collection in java.util.

// The working of Queue interface in Java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample{

	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<>();

		// add
		for (int i=0; i<5; i++)
			q.add(i);

		// display
		System.out.println("Elements of queue-"+q);

		// remove the head of queue
		int removeEle = q.remove();
		System.out.println("Removed element-"+removeEle);
		System.out.println("Queue now: "+q);

		// View the head of queue
		int head = q.peek();
		System.out.println("head of queue:"+ head);

		// rest methods, e.g. size, contains
		int size = q.size();
		System.out.println("size of queue:"+size);
	}
}