package sort_test;

public class MergeSort {
	
	public int[] merge(int[] left, int[] right){
		int[] ret_arr = new int[left.length + right.length];
		
		int curr_l = 0, curr_r = 0, ret_cnt = 0;
		while (curr_l < left.length && curr_r < right.length) {
			if (left[curr_l] <= right[curr_r]) {
				ret_arr[ret_cnt] = left[curr_l];
				ret_cnt++;
				curr_l++;
			} else {
				ret_arr[ret_cnt] = right[curr_r];
				ret_cnt++;
				curr_r++;
			}
		}
		
		if (curr_l == left.length) {
			for (int i = curr_r; i < right.length; i++){
				ret_arr[ret_cnt] = right[i];
				ret_cnt++;
			}
		} else {
			for (int i = curr_l; i < left.length; i++){
				ret_arr[ret_cnt] = left[i];
				ret_cnt++;
			}
		}
		
		return ret_arr;
	}
	
	public int[] mergeSort(int i, int j, int[] arr){
		if (i == j){
			int[] ret_arr = new int[1]; 
			ret_arr[0] = arr[i];
			return ret_arr;
		}
			
		else {
			int m = (int) Math.floor((i+j)/2);
			int[] left = mergeSort(i, m, arr);
			int[] right = mergeSort(m+1, j, arr);
			return merge(left, right);
		}
	}
}
