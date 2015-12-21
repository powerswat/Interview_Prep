package sort_test;

public class MergeSortDriver {
	
	private static MergeSort m_sort = new MergeSort();

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		int[] s_arr = m_sort.mergeSort(0, arr.length-1, arr);
		
		for (int i = 0; i < s_arr.length; i++){
			System.out.print(s_arr[i] + " "); 
		}
		System.out.println();
	}
}
