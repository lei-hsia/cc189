

// Java program for different tree traversals

// Key to traversal:  RECURSION

/* Class containing left and right child of current node
	and key value */
class Node{
	int key;
	Node left, right;

	public Node(int item){
		key = item;
		left = right = null;
	}
}

class BinaryTree{

	// root of Binary Tree
	Node root;

	BinaryTree(){
		root = null;
	}

	/* key, left, right are all referring to the value 
		of the node, NO key/value differences
		*/
	void printInorder(Node node){
		if (node == null)
			return;
		printInorder(node.left);
		printInorder(node.key + " ");
		printInorder(node.right);
	}

	void printPostorder(Node node){
		if (node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		printPostorder(node.key + " ");
	}

	void printPreorder(Node node){
		if (node == null)
			return;
		printPreorder(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	// Wrapper over above recursive functions
	void printPreorder() { printPreorder(root); }
	void printInorder() { printInorder(root); }
	void printPostorder() { printPostorder(root); }

	public static void main(String[] args){

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right =  new Node(5);

		System.out.println("preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("inorder traversal of binary tree is");
		tree.printInorder();

		System.out.println("postorder traversal of binary tree is");
		tree.printPostorder();
	}

}