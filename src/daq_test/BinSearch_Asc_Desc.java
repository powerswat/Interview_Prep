package daq_test;

/**
 * 
 * the numbers are in ascending order first and 
 * then follow a descending order
 *
 */

public class BinSearch_Asc_Desc {

	private static int[] A = {1,2,3,5,6,4,3,2};
	private static int i=0, j=A.length;
	
	public static void main(String[] args) {
		int res = bin_search(i,j);
		System.out.println(res);
	}
	
	public static int bin_search(int i, int j){
		int m = (int) Math.floor((i+j)/2);
		
		if (A[m-1]<A[m] && A[m]>A[m+1]){
			return m;
		}
		else if (A[m-1]<A[m] && A[m]<A[m+1]){
			return bin_search(m+1, j);
		}
		else
			return bin_search(m+1, j);
	}
}
