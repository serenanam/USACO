import java.util.*;
import java.io.*;

public class Repetitions2 {
	static Scanner in;
	static char[] n;

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		n = in.nextLine().toCharArray();
	}

	static void solve() {
		int cnt = 1;
		int maxcnt = 1;

		for(int i=1; i<n.length; i++) {
			if(n[i] == n[i-1]) cnt++;
			else cnt = 1;
			maxcnt = Math.max(maxcnt, cnt);
		}
		System.out.println(maxcnt);
	}
}

