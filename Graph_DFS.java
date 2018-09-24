

// java program to print DFS traversal from a given graph
import java.io.*;
import java.util.*;

// this class represents a directed graph using
// adjecent representation
class Graph_DFS{

	private int V; // # vertices

	// array of lists for Adjacency List Representation
	/*	adj is a LinkedList, each element in this 
		LinkedList is also a LinkedList
		*/
	// adj is a variable name, initialize this variable in 
	// a constructor
	private LinkedList<Integer> adj[];

	// constructor
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; i++){
			adj[i] = new LinkedList();
		}

	// add an edge into the graph
	private void addEdge(int v, int w){
		/*	add edge: 
			for each int in the linkedlist(element of linkedlist adj)
			you have an integer, then you sling an integer to this
			integer, i.e. build a link from the original integer to the
			new integer, i.e. build an edge
			*/
		adj[v].add(w);  // add w to v's list
	}

	// ESSENCE OF DFS
	private void DFSUtil(int v, boolean visited[]){

		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v+" ");

		// Recur for all vertices adjacent to this vertex
		/* Iterator: collection in java.util
			hasNext() method predefined, return type: boolean
			*/
		Interator<Integer> i = adj[v].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if (!visited[n])
				DFSUtil(v, visited)
		}

	// do DFS traversal. It uses recursive DFSUtil()
	public void DFS(int v){
		// Mark all vertices as not visited
		// set as false by default in java
		boolean visited[] = new boolean[V];

		// call recursive helper function to print DFS
		DFSUtil(v, visited);
	}

	public static void main(String[] args){
		Graph g =  new Graph(4);

		g.addEdge(0,2);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);

		System.out.println("Following is Depth First Traversal" + 
							"(starting from vertex 2)");

		g.DFS(2);
	}

}