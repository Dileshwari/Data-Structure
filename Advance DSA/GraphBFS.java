package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.AdjecencyListinGraph.Edge;

public class GraphBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 5;
		ArrayList<Edge> graph[] = new ArrayList[v];
		boolean[] visited = new boolean[v];
		createGraph(graph, 0, visited);

	
		bfs(graph, 0, visited);

	}

	
	private static void bfs(ArrayList<Edge>[] graph, int i, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);

		while (!q.isEmpty()) {

			int remove = q.remove();
			if (visited[remove] == false) {
				System.out.print(remove + " ");
				visited[remove] = true;

				for (int k = 0; k < graph[remove].size(); k++) {
					Edge e = graph[remove].get(k);
					q.offer(e.des);
				}
			}
		}
	}

	private static void createGraph(ArrayList<Edge>[] graph, int val, boolean[] visited) {
		for (int i = 0; i < graph.length; i++) {

			graph[i] = new ArrayList<>();
		}
		GraphBFS k = new GraphBFS();
		graph[0].add(k.new Edge(0, 1));
		graph[0].add(k.new Edge(0, 2));
		graph[1].add(k.new Edge(1, 0));
		graph[1].add(k.new Edge(1, 2));
		graph[1].add(k.new Edge(1, 3));
		graph[2].add(k.new Edge(2, 0));
		graph[2].add(k.new Edge(2, 1));
		graph[3].add(k.new Edge(3, 1));

	}

	class Edge {

		int src;
		int des;

		Edge(int src, int des) {

			this.src = src;
			this.des = des;
		}
	}

}
