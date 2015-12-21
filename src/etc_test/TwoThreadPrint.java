package etc_test;

/**
 * Two threads, one thread only prints odd numbers
 * and the other thread only prints even numbers.
 * Print 1 to 20 using both threads.
 */

public class TwoThreadPrint extends Thread {

	private int id;
	private int val;
	
	/* Create a contructor of the thread */
	public TwoThreadPrint(int id){
		this.id = id;
		if (id%2==1) {
			this.val = 1;
		} else {
			this.val = 2;
		}
	}
	
	/* Specify the action of the threads */
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("ID: " + this.id + ", VAl: " + this.val);
			this.val += 2;
		}
	}
	
	/* Driver program */
	public static void main(String[] args) {
		TwoThreadPrint odd_thr = new TwoThreadPrint(1);
		TwoThreadPrint even_thr = new TwoThreadPrint(2);
		odd_thr.start();
		even_thr.start();
	}

}
