import java.util.*;
import java.io.*;

public class TwoSets {
	static Scanner in;
	static int N, a[], sum, set1[], set2[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		sum = 0;
		for(int i=0; i<N; i++) {
			a[i] = i+1;
			sum += a[i];
		}
	}

	static void solve() {
		int half1 = 0;
		int half2 = 0;
		if(sum%2 != 0) System.out.println("NO");
		else {
			System.out.println("YES");
			for(int i=0; i<N; i++) {
				half1 += a[i];
				if(half1 > sum/2) half1 -= a[i];
			}
		}
		
	}

}

