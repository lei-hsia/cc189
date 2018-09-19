
// implementation of single linked list

// A simple java program to introduce a linked list
class LinkedList{

	Node head; // head是一个类变量,区别于实例变量

	// Linked list Node.
	// This inner class is made static so main() can access it.
	// static：所以object belongs specifically to the class,
	// instead of instances of class.
	static class Node{
		int data;
		Node next;  // next is of type Node

		Node(int d){ data=d; next=null; } // Constuctor
	}

	public static void main(String[] args){

		// Create a linkedList object
		LinkedList 1list = new LinkedList();

		// create nodes: elements of this linked list
		1list.head = new Node(1); 
		//首先初始化Node,之后才是把这些node串起来连成一个linkedList
		Node second = new Node(2); 
		Node third = new Node(3);

		// assign Node second to head's next,i.e. head's next points to second now
		1list.head.next = second;  
		second.next = third;
	}
}


// linked list traversal 
class LinkedList{

	Node head = null;

	static class Node{
		int data;
		Node next;
		Node(int d){ data=d; next=null;}
	}

	// this function prints contents of linked list
	// starting from head
	// traversal by node, go following the link
	public void traversalList(){
		Node n = head;
		while (n  != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(Stirng[] args){

		LinkedList 2list = new LinkedList();

		// create nodes of this linked_list object
		2list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		2list.next = second;
		second.next = third;

		2list.traversalList();


	}

















}