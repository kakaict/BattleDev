package crackingCode.binaryTree;

import java.util.Arrays;


/*
 * Find the distance between 2 nodes in binary tree.
 * A node (not leaf) have right node and left node.
 * The nodes are represented by different numbers. 
 * 
 * Algorithm : d(n1,n2) = d(root, n1) + d(root,n2) - 2* d(root, lowestParent(n1,n2))
 * lowestParent(n1,n2) : the lowest parent node of n1 and n2.
 */


public class SearchInBinraryTree {

	public static void main(String[] args) {

		
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		root.left.right.right = new Node(45);
		
		
		System.out.println(distanceToRoot(root, 25) + distanceToRoot(root, 35) - 2 * distanceToRoot(root, findALC(root, 35, 25).data));

		
	}
	
	public static Node findALC(Node root, int n1, int n2) {
		
		if(root == null) return null;
		
		if(root.data == n1|| root.data == n2){
			return root;
		}
		
		Node l = findALC(root.left, n1, n2);
		Node r = findALC(root.right, n1, n2);
		
		
		if (l != null && r != null){
			return root;
		} 
		if(l != null) return l;

		if(r != null) return r;
		
		return null;
	}
	
	public static int distanceToRoot(Node root, int  n) {
		if (root == null) return -1;
		if(root != null && root.data == n) return 0;
		
		int l = distanceToRoot(root.right, n);
		int r = distanceToRoot(root.left, n);
		
		if(l == -1 && r == -1) {
			return -1;
		}
	    return 1 + Math.max(l,r); 
	}
	
	
	public static class Node {
		
		int data;
		
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}

}
