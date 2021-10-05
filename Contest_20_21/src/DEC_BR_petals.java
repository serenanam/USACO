import java.util.*;
import java.io.*;

public class DEC_BR_petals {
	static Scanner in;
	static int N, p[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		p = new int[N];
		for(int i=0; i<N; i++) {
			p[i] = in.nextInt();
		}
	}

	static void solve() {
		int sum = 0;
		double avg = 0;
		boolean avgflower = false;
		int count = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=i; j<N; j++) {
				for(int k=i; k<=j; k++) {
					sum += p[k];
				}
				
//				System.out.println("sum: " + sum);
				avg = (double) sum / (double) (j-i+1);
				
				for(int k=i; k<=j; k++) {
					if(avg == (double) p[k]) avgflower = true;
//					System.out.println("avg: " + avg + " p[" + k+ "]: " + p[k] + " " + avgflower);
				}
				if(avgflower) count++;
				avgflower = false;
				sum = 0;
			}
			
		}
		System.out.println(count);
	}
}

