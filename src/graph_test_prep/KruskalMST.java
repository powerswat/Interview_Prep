package graph_test_prep;

import java.util.ArrayList;

public class KruskalMST {

	private static int[][] krus_mst;
	private static MrgSrtForKrus m_sort = new MrgSrtForKrus();
	private static int[] connected; 
	
	public static void krusMST(int[][] graph){
		ArrayList<EdgesForKrus> edges 
			= new ArrayList<EdgesForKrus>();
		ArrayList<EdgesForKrus> srtd_edges 
		= new ArrayList<EdgesForKrus>();
		
		for (int i = 0; i < graph.length; i++){
			for (int j = 0; j < graph.length; j++){
				if (graph[i][j] < 100){
					edges.add(new EdgesForKrus(i, j, graph[i][j]));
				}
			}
		}
		
		srtd_edges = m_sort.mergeSort(0, edges.size()-1, edges);
		
		for (int i = 0; i < srtd_edges.size(); i++){
			if (connected[srtd_edges.get(i).getFrom()] == 0 ){
				connected[srtd_edges.get(i).getFrom()] = 1;
				connected[srtd_edges.get(i).getTo()] = 1;
				krus_mst[srtd_edges.get(i).getFrom()][srtd_edges.get(i).getTo()]
						= srtd_edges.get(i).getWeight();
			}
		}
		
		int a = 1;
		a++;
	}
	
	public static void printMST() {
		
	}
	
	public static void main(String[] args) {
		/* Let us create the following graph
        	2    3
    	(0)--(1)--(2)
	     |   / \   |
	    6| 8/   \5 |7
	     | /     \ |
	    (3)-------(4)
	          9          */
		
		int[][] graph = {{100, 2, 100, 6, 100},
						{2, 100, 3, 8, 5},
						{100, 3, 100, 100, 7},
						{6, 8, 100, 100, 9},
						{100, 5, 7, 9, 100}};
		
		krus_mst = new int[graph.length][graph.length];
		connected = new int[graph.length];
		for (int i = 0; i < graph.length; i++){
			for (int j = 0; j < graph.length; j++){
				krus_mst[i][j] = 0;
			}
			connected[i] = 0;
		}
		
		krusMST(graph);
		printMST();
	}
	
}
