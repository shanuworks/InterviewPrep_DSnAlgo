package com.learning.examples;

public class PrintNodes {

}


//
findNode(Node root, Node givenNode,  int k){
	Node ptr = root;
	Node prev = null;
	int count;
	while(ptr != null) {
		if(ptr.data == givenNode.data) {
			count =0;
			while(ptr.left != null && count != k) {
				prev =  ptr;
				ptr = ptr.left;
				count ++;	
				if(count == k) {
					System.out.println(ptr.data);
				}
			}
		}
	}
}

findNode(Node root, Node givenNode,  int k, int count) {
	
	if(root == null) {
		return
	}
	if(count == k) {
		system(root.data);
	}
	findNode(root.left, givenNode, k, count+1);
	findNode(root.right, givenNode,k, count+1);
	
}



-> 2

								1                            /       \                          2          3                       /   \       /   \                     4     5    6       7                                     \                                      8


