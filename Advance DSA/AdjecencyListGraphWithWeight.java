
package Graph;

import java.util.ArrayList;

public class AdjecencyListGraphWithWeight {

	public static void main(String[] args) {
		int v = 4;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);

		for (int i = 0; i < graph[2].size(); i++) {

			Edge e = graph[2].get(i);
			System.out.println("Des: "+e.des + "|weight: "+e.weight);
		}
	}

	private static void createGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {

			graph[i] = new ArrayList<>();
		}
		AdjecencyListGraphWithWeight k = new AdjecencyListGraphWithWeight();
		graph[0].add(k.new Edge(0, 2, -8));
		graph[1].add(k.new Edge(1, 2, 2));
		graph[1].add(k.new Edge(1, 3, 9));
		graph[2].add(k.new Edge(2, 0, -8));
		graph[2].add(k.new Edge(2, 3, -1));
		graph[2].add(k.new Edge(2, 1, 2));
		graph[3].add(k.new Edge(3, 1, 9));
		graph[3].add(k.new Edge(3, 2, -1));

	}

	class Edge {

		int src;
		int des;
		int weight;

		Edge(int src, int des, int weight) {

			this.src = src;
			this.des = des;
			this.weight = weight;
		}
	}
}
