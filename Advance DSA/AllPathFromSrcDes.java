
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AllPathFromSrcDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		boolean[] visited = new boolean[v];
		createGraph(graph, 0);

		AllPathFromSrctoDes(graph, visited, 0, 5, 0+"");

	}

	private static void AllPathFromSrctoDes(ArrayList<Edge>[] graph, boolean[] visited, int curr, int de, String path) {

		if(curr==de) {
			
			System.out.print(path+" ");
			return;
		}
		
		for(int i=0;i<graph[curr].size();i++) {
			
			Edge e=graph[curr].get(i);
			if(visited[e.des]==false) {
				
				visited[curr]=true;
				AllPathFromSrctoDes(graph, visited, e.des, de, path+e.des);
				visited[curr]=false;
			}
		}

	}

	private static void createGraph(ArrayList<Edge>[] graph, int val) {
		for (int i = 0; i < graph.length; i++) {

			graph[i] = new ArrayList<>();
		}
		AllPathFromSrcDes k = new AllPathFromSrcDes();
		graph[0].add(k.new Edge(0, 1));
		graph[0].add(k.new Edge(0, 2));
		graph[1].add(k.new Edge(1, 0));
		graph[1].add(k.new Edge(1, 3));
		graph[2].add(k.new Edge(2, 0));
		graph[2].add(k.new Edge(2, 4));
		graph[3].add(k.new Edge(3, 1));
		graph[3].add(k.new Edge(3, 4));
		graph[3].add(k.new Edge(3, 5));
		graph[4].add(k.new Edge(4, 3));
		graph[4].add(k.new Edge(4, 2));
		graph[4].add(k.new Edge(4, 5));
		graph[5].add(k.new Edge(5, 6));
		graph[6].add(k.new Edge(6, 5));

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
