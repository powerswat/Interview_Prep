package sort_test;

public class FindUniqueStrBucketSort {

	private static boolean findDup(String str) {
		int len_str = str.length();
		int[] bucket = new int[len_str]; 
		int char_ascii = 0;
		
		// Find max and min ascii value	
		int min=100000000; 
		int max=0;
		for (int i = 0; i < str.length(); i++) {
			char_ascii = (int) str.charAt(i);		
			if (min > char_ascii) {
				min = char_ascii;
			}
			if (max < char_ascii) {
				max = char_ascii;
			} 
		}
				
		int[] hist = new int[max-min+1];
			for (int i=0; i < str.length(); i++){
				char_ascii = (int) str.charAt(i);
				if (hist[char_ascii - min] == 1){
					return false;
				} else {
					hist[char_ascii - min] = 1;
				}
			}
				
		return true;
	}
	
	
	public static void main(String[] args){
		String str1 = "The man had gloves";
		String str2 = "This one";
		
		boolean is_unique = findDup(str1);
		System.out.println(is_unique);
		is_unique = findDup(str2);
		System.out.println(is_unique);
	}
}
