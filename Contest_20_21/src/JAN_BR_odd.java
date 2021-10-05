import java.util.*;
import java.io.*;

public class JAN_BR_odd {
	static Scanner in;
	static int N, a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}
	}

	static void solve() {
		int even = 0;
		int odd = 0;
		for(int i=0; i<N; i++) {
			int x = a[i];
			if(x%2==0) even++;
			else odd++;
		}
		while(odd > even) {
			odd-=2;
			even++;
		}
		if(even > odd+1) even = odd+1;
		System.out.println(odd+even);
	}

}

