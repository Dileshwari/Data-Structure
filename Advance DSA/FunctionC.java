import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class FunctionC {
	static Node root;
	void printInorder(Node node)
	{
	    if (node == null)
	        return;

	    // First recur on left child
	    printInorder(node.left);

	    // Then print the data of node
	    System.out.print(node.data + " ");

	    // Now recur on right child
	    printInorder(node.right);
	}
    
    


    // Driver program to test above functions
    public static void main(String args[])
    {
    	FunctionC tree = new FunctionC();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of"
                           + "binary tree is ");
        tree.printInorder(root);
    }
}