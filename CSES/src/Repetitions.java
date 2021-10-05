import java.util.*;
import java.io.*;

public class Repetitions {
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
		String max = "";
		String temp = "";
		for(int i=0; i<n.length; i++) {
			for(int j=i; j<n.length; j++) {
				if(n[i] == n[j]) {
					temp += n[j];
				}
				else break;
			}
			if(temp.length() > max.length()) {
				max = temp;
			}
			temp = "";
		}
		
		System.out.println(max.length());
	}

}

