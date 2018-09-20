

class exercise_linkedList{

	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d){data = d; next = null;}
	}

	public void tranversal_list(){

		Node n = head;
		while(n!= null){
			System.out.print(n.data + " ");
			n = n.next; 
		}
	}

	public static void main(String[] args){

		exercise_linkedList new_list = new exercise_linkedList();

		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		head.next = second;
		second.next = third;

		new_list.tranversal_list(); 
	}

}