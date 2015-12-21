package math_test;

import java.util.Vector;

/**
 * given two number l and r (l<=r<=10^6) find most frequent 
 * digit among all prime numbers between l and r inclusive. 
 * if frequency is same print highest digit.
 */

public class FindPrimeNo {
	
	public static void main(String[] args) {
		int l = 43;
		int r = 1000;
		
		// Find all the prime numbers in the given range
		Vector<Integer> prime_nums = findPrimeNums(l,r);
		for (int i = 0; i < prime_nums.size(); i++) {
			int curr_num = prime_nums.get(i);
			if (curr_num >= l)
				System.out.println(prime_nums.get(i));
		}
		
		// Find a digit of the maximum frequency from the prime numbers
		int max_freq_digit = findMaxFreqDigit(prime_nums, l);
	}

	/* Find all the prime numbers in the given range */
	public static Vector<Integer> findPrimeNums(int l, int r){
		Vector<Integer> prime_nums = new Vector<Integer>();
		int[] idcs = new int[(r+1)];
		
		// Initialize to 1
		for (int i=1; i<idcs.length; i++)
			idcs[i] = 1;
		idcs[0] = -1;
		idcs[1] = 0;
		
		// Find the power of every number above than 1
		for (int i = 2; i < idcs.length; i++) {
			int num_iter_j = (int)((r/i)+1);
			
			for (int j = 1; j < num_iter_j; j++) {
				if (idcs[i] == 0)
					break;
				if (i*(j+1) <= r)
					idcs[i*(j+1)] = 0;
			}
		}
		
		// Put all the found prime numbers into the vector
		for (int i = 0; i < idcs.length; i++) {
			if (idcs[i]==1) {
				prime_nums.add(i);
			}
		}
		return prime_nums;
	}
	
	/* Find a digit of the maximum frequency from the prime numbers */
	public static int findMaxFreqDigit(Vector<Integer> prime_nums, int l){
		int max_digit = 0;
		
		// Convert all the digits in all the numbers into a single string
		String concat_str = "";
		for (int i = 0; i < prime_nums.size(); i++) {
			if (prime_nums.get(i) >= l) {
				String cur_int_str = Integer.toString(prime_nums.get(i));
				concat_str = concat_str + cur_int_str;
			}
		}
		
		// Count the frequency of each digit
		int[] digit_freqs = new int[10];
		
		for (int i = 0; i < digit_freqs.length; i++) {
			digit_freqs[i] = 0;
		}
		for (int i = 0; i < concat_str.length(); i++) {
			char c = concat_str.charAt(i);
			int val = Integer.parseInt(String.valueOf(c));
			for (int j = 0; j < digit_freqs.length; j++) {
				if (j==val)
					digit_freqs[j]++;
			}
		}
		
		// Find the maximum frequency number
		int max_freq_digit = -1;
		int max_freq = 0;
		for (int i = 0; i < digit_freqs.length; i++) {
			if (max_freq <= digit_freqs[i]) {
				max_freq = digit_freqs[i];
				max_freq_digit = i;
			}
		}
		
		return max_digit;		
	}
}
