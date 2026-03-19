package Graph;

import java.util.*;

public class BFS {

	public static void main(String[] args) {

		int v = 5;
		List<List<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			adj.add(new ArrayList<>());
		}

		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 4);

		System.out.println("BFS strting from 0");
		boolean[] visited = new boolean[v];
		dfs(adj, 0, visited);

	}

	private static void dfs(List<List<Integer>> adj, int i, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		visited[i] = true;
		q.offer(i);

		while (!q.isEmpty()) {

			int r = q.poll();
			System.out.print(r+" "+adj.get(r)+"   ");
			for (int x : adj.get(r)) {

				if (!visited[x]) {

					visited[x] = true;
					q.offer(x);

				}
			}
		}
	}

	private static void addEdge(List<List<Integer>> adj, int i, int j) {

		adj.get(i).add(j);
		adj.get(j).add(i);

	}
}
