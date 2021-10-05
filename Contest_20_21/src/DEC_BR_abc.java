import java.util.*;
import java.io.*;

public class DEC_BR_abc {
	static Scanner in;
	static int n[], a, b, c, min, abc, bc;

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		n = new int[7];
		for(int i=0; i<n.length; i++) {
			n[i] = in.nextInt();
		}
	}

	static void solve() {
		a = Integer.MAX_VALUE;
		abc = Integer.MIN_VALUE;
		int ain = 0;
		for(int i=0; i<n.length; i++) {
			if(n[i] <= a) {
				ain = i;
				a = n[i];
			}
			abc = Math.max(abc, n[i]);
		}
		bc = abc - a;
		
		int bin = 0;
		int cin = 0;
		for(int i=0; i<n.length; i++) {
			b = n[i];
			for(int j=0; j<n.length; j++) {
				c = n[j];
				if(i!=j && b+c == bc) {
					bin = i;
					cin = j;
				}
			}
		}
		
		b = Math.min(n[bin], n[cin]);
		c = Math.max(n[bin], n[cin]);
		System.out.println(a + " " + b + " " + c);
	}

}

