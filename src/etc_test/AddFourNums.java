package etc_test;

/**
 * given a number N. print in how many ways it can be 
 * represented as N = a+b+c+d , 1< =a< =b< =c< = d; 1<=N<=5000
 */

public class AddFourNums {

	private static int N = 5000;
	
	public static void main(String[] args) {
		int cnt = 0;
		int st_i = (int) N/4;
		for (int i = st_i; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j>i) {
					break;
				}
				for (int k = 1; k <= N; k++) {
					if (k>j) {
						break;
					}
					if (i+j+k < N && (N-i-j-k) <= k) {
						/*System.out.println((N-i-j-k) + "+" 
									+ k + "+" + j + "+" 
									+ i + "=" + N);*/
						cnt++;
					}
				}
			}
		}
		System.out.println("Total cnt: " + cnt);
	}
}
