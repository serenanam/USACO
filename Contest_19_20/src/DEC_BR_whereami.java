import java.util.*;
import java.io.*;

public class DEC_BR_whereami {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static String a;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("whereami.in"));
		out = new PrintWriter(new FileWriter("whereami.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		in.nextLine();
		a = in.nextLine();
	}

	static void solve() {
		String temp = "";
		int n1 = 0;
		int n2 = 0;
		boolean flag = true;
		int ans = 0;
		for(int i=1; i<=N; i++) {
			for(int j=0; j<=N-i; j++) {
				temp = a.substring(j, j+i);
				n1 = a.indexOf(temp);
				n2 = a.lastIndexOf(temp);
				
				if(n1 != n2) {
					flag = false;
					break;
				}
				
			}
			
			if(flag) {
				ans = i;
				break;
			}
			flag = true;
		}
		out.println(ans);
	}

}

