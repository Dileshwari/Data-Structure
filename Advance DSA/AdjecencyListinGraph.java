package Graph;

import java.util.ArrayList;

public class AdjecencyListinGraph {

	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		createGraph(graph);
		
		for(int i=0;i<graph[2].size();i++) {
			
			Edge e=graph[2].get(i);
			System.out.print(e.des+" ");
		}
	}
	private static void createGraph(ArrayList<Edge>[] graph) {
		for(int i=0;i<graph.length;i++) {
			
			graph[i]=new ArrayList<>();
		}
		AdjecencyListinGraph k=new AdjecencyListinGraph();
		graph[0].add(k.new Edge(0,2));
		graph[1].add(k.new Edge(1,2));
		graph[1].add(k.new Edge(1,3));
		graph[2].add(k.new Edge(2,0));
		graph[2].add(k.new Edge(2,1));
		graph[3].add(k.new Edge(3,1));
		
	}
	class Edge{
		
		int src;
		int des;
		
		Edge(int src, int des) {
			
			this.src=src;
			this.des=des;
		}
	}
}
