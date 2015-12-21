package graph_test_prep;

public class MST {
	
	private static int[][] prim_mst;
	
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
		
		prim_mst = new int[graph.length][graph.length];
		for (int i = 0; i < graph.length; i++){
			for (int j = 0; j < graph.length; j++){
				prim_mst[i][j] = 0;
			}
		}
		
		primMST(graph);
		printMST();
	}

	public static void primMST(int[][] graph){
		
		int[] visited = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < graph.length; i++){
			
			if (visited[i] == 1){
				continue;
			}
			visited[i] = 1;
			
			int min_weight = 100;
			int next_j = -1;
			for (int j = 0; j < graph.length; j++){
				// Find the minimum weight edge from node i
				if (graph[i][j] < min_weight) {
					min_weight = graph[i][j];
					next_j = j;
				}
			}
			
			if (next_j >= 0){
				prim_mst[i][next_j] = min_weight;
				prim_mst[next_j][i] = min_weight;
			}
		}
	}
	
	public static void printMST(){
		for (int i = 0; i < prim_mst.length; i++){
			for (int j = 0; j < prim_mst.length; j++){
				System.out.print(prim_mst[i][j] + " ");
			}
			System.out.println();
		}
	}
}
