import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchtreekTH {
   
    private static void printInOrder(TreeNode root) {
       
        if (root == null) {
        	return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    
    }

    public static void main(String[] args) {
        // Creating a BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);
        
        System.out.println("Binary Search Tree: ");
        printInOrder(root);
        System.out.println();
       List kthElements = BinarySearchtreekTH.findKth(root, 4);
       System.out.println("Kth smallest element: " + kthElements.get(0));
       System.out.println("Kth largest element: " + kthElements.get(1));
    }

	
	
	    private static void inorder(TreeNode node, List arr) {
	        if (node == null) {
	            return;
	        }
	        inorder(node.left, arr);
	        arr.add(node.val);
	        inorder(node.right, arr);
	        return;
	    }
	    
	    
	    
	    public static List findKth(TreeNode node, int k) {
	        
	        List arr = new ArrayList<>();
	        inorder(node, arr);
	        int kLargest = (int) arr.get(arr.size() - k);
	        int kSmallest = (int) arr.get(k - 1); 
	       // return kLargest;
	        return Arrays.asList(kSmallest, kLargest);
	    }
	
}