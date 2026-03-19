
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.AdjecencyListinGraph.Edge;

public class GraphDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 5;
		ArrayList<Edge> graph[] = new ArrayList[v];
		boolean[] visited = new boolean[v];
		createGraph(graph, 0);

		dfs(graph, 1, visited);

	}

	private static void dfs(ArrayList<Edge>[] graph, int i, boolean[] visited) {
		System.out.print(i + " ");
		visited[i] = true;

		for (int k = 0; k < graph[i].size(); k++) {

			Edge e = graph[i].get(k);
			if (visited[e.des] == false) {
				dfs(graph, e.des, visited);
			}
		}

	}

	private static void createGraph(ArrayList<Edge>[] graph, int val) {
		for (int i = 0; i < graph.length; i++) {

			graph[i] = new ArrayList<>();
		}
		GraphDFS k = new GraphDFS();
		graph[0].add(k.new Edge(0, 1));
		graph[1].add(k.new Edge(1, 4));
		graph[0].add(k.new Edge(0, 2));
		graph[0].add(k.new Edge(0, 3));
		graph[1].add(k.new Edge(1, 0));
		graph[1].add(k.new Edge(1, 2));
		graph[1].add(k.new Edge(1, 3));
		graph[2].add(k.new Edge(2, 0));
		graph[2].add(k.new Edge(2, 1));
		graph[3].add(k.new Edge(3, 1));
		graph[3].add(k.new Edge(3, 0));
		graph[4].add(k.new Edge(4, 1));

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
