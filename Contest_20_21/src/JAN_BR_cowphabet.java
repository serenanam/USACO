import java.util.*;
import java.io.*;

public class JAN_BR_cowphabet {
	static Scanner in;
	static char[] ref, a;
	static int[] t;

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		ref = in.nextLine().toCharArray();
		a = in.nextLine().toCharArray();
		//		System.out.println(Arrays.toString(a));
		//		System.out.println(Arrays.toString(ref));
		t = new int[a.length];
	}

	static void solve() {
		int cnt = 1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<ref.length; j++) {
				if(a[i] == ref[j]) {
					t[i] = j;
				}
			}
		}
		//		System.out.println(Arrays.toString(t));
		for(int i=0; i<a.length-1; i++) {
			if(t[i] < t[i+1]) continue;
			else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

