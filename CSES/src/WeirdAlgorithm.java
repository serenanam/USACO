import java.util.*;
import java.io.*;

public class WeirdAlgorithm {
	static Scanner in;
	static long n;

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		n = in.nextInt();
	}

	static void solve() {
		while(n > 1) {
			System.out.print( n + " ");
			if(n%2==0) n /= 2;
			else n = (n * 3) + 1;
		}
		
		System.out.print(n);
	}

}

