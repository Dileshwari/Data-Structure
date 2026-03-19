package Graph;

import java.util.ArrayList;

import Graph.AllPathFromSrcDes.Edge;

public class isCyclicGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int v=7;
       ArrayList<Edge> graph[]=new ArrayList[v];
 
       
       createGraph(graph);
       int curr=0;
       boolean[] visited =new boolean[v];
       boolean[] v1=new boolean[v];
       System.out.print(iscyscle(graph, visited, curr, v1));
	}

	private static boolean iscyscle(ArrayList<Edge>[] graph, boolean[] visited, int curr, boolean[] v1) {
		
		visited[curr]=true;
		v1[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			
			Edge e=graph[curr].get(i);
			if(v1[e.des]==true) {
				return true;
				
			}else if(visited[e.des]==false) {
				if(iscyscle(graph, visited, e.des, v1)) return true;
				
			}
			
		}
		 v1[curr]=false;
		 return false;
		
	}

	private static void createGraph(ArrayList<Edge>[] graph) {
		for(int i=0;i<graph.length;i++) {
			
			graph[i]= new ArrayList<>();
		}
		isCyclicGraph k=new isCyclicGraph();
		
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
	class Edge{
		
		int src;
		int des;
		
		Edge(int src, int des){
			
			this.src=src;
			this.des=des;
		}
	}

}
