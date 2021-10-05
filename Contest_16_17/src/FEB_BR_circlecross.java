import java.util.*;
import java.io.*;

public class FEB_BR_circlecross {
	static Scanner in;
	static PrintWriter out;
	static String a;
	static int start, end;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("circlecross.in"));
		out = new PrintWriter(new FileWriter("circlecross.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		a = in.nextLine();
	}

	static void solve() {
		int cnt = 0;
		for(int i='A'; i<='Z'; i++) {
			start = a.indexOf((char) (i));
			end = a.lastIndexOf((char) (i));
			for(int j=start+1; j<end; j++) {
				char c = a.charAt(j);
				String sub = a.substring(start+1, end);
				if(sub.indexOf(c) == sub.lastIndexOf(c)) cnt++;
			}
		}
		out.println(cnt/2);
	}
}