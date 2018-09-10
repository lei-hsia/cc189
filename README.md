# cracking_the_coding_interview
cracking the coding interview notes

1. time complexity of sorting a string using COMPARISION SORT: O(N logN). (there're algorithms that has a smaller big-O but those are not general cases, not discussed here)

using the decision tree model.

Permutation(a1, a2, ..., an): n!, in which the right order(a1'<a2'<...<an') is one of those n! scenarios. i.e. P=1/n!

Construct a tree, the root node is (a1, a2, ..., an), as given. Comparing the first 2 elements and generate result: either Permutation(a1, a2, ..., an) or Permutation(a2, a1, ..., an) as the right result. this is one-step down the tree: 1->2 nodes.

Now the 1st layer has 2 nodes: Permutation(a1, a2, ..., an) and Permutation(a2, a1, ..., an). Extend from these 2 results: 1) from (a1, a2, ..., an), compare a3 & a2, get the right order of the first 3 elements as either (a1,a2,a3...) or (a1,a3,a2...)

我也想过这里少了(a3,a1,a2...)这个，但是并不是真的少了，因为另一个node,(a2,a1,...,an)向下延伸的比较结果得到: either (a2,a1,a3...) or (a2,a3,a1...), 这里就有了(a3,a1,a2...)的顺序:虽然是倒过来的。但是并没有影响: 因为排序只是说排序，并没有要求是从小到大排序，所以每一次comparison得到的结果是cover了全部可能的permutation的结果的(从大到小和从小到大的顺序不影响的情况下).

In fact, don't think in the permutation way is more straightforward: think of the results of each comparison as a 1/0 outout: compare once, get the relation of 2 elements, so this is a BINARY TREE. 

It's a binary tree, the lowest row contains all the possibilities of all permutations of those n elements: n! cases in total. So the depth of tree is log(n!).  

log(n!) increases at the same rate as log(nlogn), so the comparison sorting has a time complexity of O(nlogn).

---------
Show log(n!) grows as quick as log(nlogn): i.e. log(n!)<=log(nlogn) & log(n!)>=log(nlogn).

1. log(n!)<=log(nlogn): get rid of log => to prove (n!<=n^n), obvious.

2. log(n!)>=log(nlogn): n! = n(n-1)(n-2)...1, write all the front (n/2) elements as (n/2) and drop the later (n/2) elements => n! > (n/2)^(n/2). Take log => log(n!)>(n/2)log(n/2).  (n/2)log(n/2) is the same as nlog(n) in time complexity.

So the (optimal)time complexity of comparison sorting a string is O(nlogn). 

General case: QuickSort, MergeSort, ShellSort are all O(nlogn), bubblesort, selection sort, insertion sort: O(n^2).
