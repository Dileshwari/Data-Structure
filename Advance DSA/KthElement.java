import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class KthElement {

	public static void main(String[] args) {
		KthElement k = new KthElement();
		// TODO Auto-generated method stub
		TreeNode root = k.new TreeNode(10);
		root.left = k.new TreeNode(5);
		root.right = k.new TreeNode(13);
		root.left.left = k.new TreeNode(3);
		root.left.left.left = k.new TreeNode(2);
		root.left.left.right = k.new TreeNode(4);
		root.left.right = k.new TreeNode(6);
		root.left.right.right = k.new TreeNode(9);
		root.right.left = k.new TreeNode(11);
		root.right.right = k.new TreeNode(14);

		System.out.println("Binary Search Tree is:" + BFS(root));
		DFS(root);
	}

	private static void DFS(TreeNode root) {

		Stack<TreeNode> s = new Stack<>();
		if (root == null) {

			return;
		}
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode t = s.pop();
			System.out.print(t.value+" ");
			if (t.right != null) {

				s.push(t.right);
			}
			if (t.left != null) {

				s.push(t.left);
			}
		}

	}

	private static List<List<Integer>> BFS(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {

			return result;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> currentlevel = new ArrayList<>();

			for (int i = 0; i < size; i++) {

				TreeNode currentNode = q.poll();
				currentlevel.add(currentNode.value);

				if (currentNode.left != null) {

					q.offer(currentNode.left);
				}
				if (currentNode.right != null) {

					q.offer(currentNode.right);
				}
			}
			result.add(currentlevel);
		}

		return result;
	}

	class TreeNode {
		private TreeNode left;
		TreeNode right;
		private int value;

		TreeNode(int value) {
			this.value = value;
		}

	}

}
