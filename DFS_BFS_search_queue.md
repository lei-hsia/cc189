DFS:

```
void search(Node root){
	if(root==null) return;
	// visit(node): built-in in java
	visit(root);
	root.visited = true;
	for each(Node n in root.adjacent){
		if(n.visited == false)
			search(n);
	}
}
```
(画图更好理解)

1. DFS: 一直都是search重复这个pattern, A-B-往下，所以是depth first;

2. BFS: A-B, 找到root的adjacent节点之后不是重复往下search, 而是把这个节点拿出来存到一个地方, 然后还是搜同一个节点的adjacent直到结束为止, 存起来的节点遵循先进先出，所以用queue

BFS:

```
void search(Node root){
	Queue queue = new Queue();
	root.marked = true;
	queue.enqueue(root); // add to the end
	
	while(!queue.isEmpty()){
		Node r = queue.dequeue(); //remove front
		visit(r);
		foreach (Node n in r.adjacent){
			if(n.marked == false){
				n.marked = true;
				queue.enqueue(n);
			}
		}
	}
	
}
```