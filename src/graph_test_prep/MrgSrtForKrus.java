package graph_test_prep;

import java.util.ArrayList;

public class MrgSrtForKrus {
	
	public ArrayList<EdgesForKrus> merge(
			ArrayList<EdgesForKrus> left, ArrayList<EdgesForKrus> right){
		ArrayList<EdgesForKrus> ret_arr = new ArrayList<EdgesForKrus>();
		
		int curr_l = 0, curr_r = 0;
		while (curr_l < left.size() && curr_r < right.size()) {
			if (left.get(curr_l).getWeight() <= right.get(curr_r).getWeight()) {
				ret_arr.add(left.get(curr_l));
				curr_l++;
			} else {
				ret_arr.add(left.get(curr_r));
				curr_r++;
			}
		}
		
		if (curr_l == left.size()) {
			for (int i = curr_r; i < right.size(); i++){
				ret_arr.add(right.get(i));
			}
		} else {
			for (int i = curr_l; i < left.size(); i++){
				ret_arr.add(left.get(i));
			}
		}
		
		return ret_arr;
	}
	
	public ArrayList<EdgesForKrus> mergeSort(int i, int j, ArrayList<EdgesForKrus> arr){
		if (i == j){
			ArrayList<EdgesForKrus> ret_arr = new ArrayList<EdgesForKrus>(); 
			ret_arr.add(arr.get(i));
			return ret_arr;
		}
			
		else {
			int m = (int) Math.floor((i+j)/2);
			ArrayList<EdgesForKrus> left = mergeSort(i, m, arr);
			ArrayList<EdgesForKrus> right = mergeSort(m+1, j, arr);
			return merge(left, right);
		}
	}
}
