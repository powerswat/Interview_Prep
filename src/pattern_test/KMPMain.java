package pattern_test;

/**
 * 
 * This reference adopted from
 * http://www.geeksforgeeks.org/searching-for-patterns-set-2-kmp-algorithm/
 *
 */
public class KMPMain {
	private static String txt = "ABABDABACDABABCABAB";
	private static String pat = "ABABCABAB";
	private static int[] lps;
	
	public static void main(String[] args){
		KMPSearch(pat, txt);
	}
	
	private static void KMPSearch(String pat, String txt) {
		int M = pat.length();		// M: 주어진 패턴의 길이
		int N = txt.length();		// N: 패턴을 찾기위해 주어진 text의 길이
		
		// 주어진 pattern에 대해서 가장 긴 prefix suffix information을 저장할 배열 
		// lps[]를 만듦
		lps = new int[N];
		int j = 0;					// pat[]의 index로 사용하기 위한 용도
		
		// 주어진 pattern에 대해서 pre-processing을 함
		computeLPSArray(pat, M, lps);
		
	}
	
	// 주어진 pattern에 대해서 pre-processing을 함
	public static void computeLPSArray(String pat, int M, int[] lps){
		int len = 0;		// len: 직전의 가장 긴 prefix, suffix의 길이를 저장하는 용도
		int i = 1;
		
		lps[0] = 0;
		
		while(i < M){
			// pattern 내부에서 현재 보고 있는 글자가, 직전에 봤던 글자와 같은 경우
			if(pat.charAt(i) == pat.charAt(len)){
				len++;
				lps[i] = len;
				i++;
			} else { 	// pat.charAt(i) != pat.charAt(len)
				
			}
		}
	}
}
