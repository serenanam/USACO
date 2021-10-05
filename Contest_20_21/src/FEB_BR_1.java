import java.util.*;
import java.io.*;

public class FEB_BR_1 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n;
	static HashMap<String, Integer> m; 
	static HashMap<String, pair> cow;
	static String[] n1, n2, ani, con;
	static String[] ref = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse",	"Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));

		init();
		solve();
		in.close();

	}

	static void init() throws IOException {
		m = new HashMap<String, Integer>();
		for(int i=0; i<12; i++) m.put(ref[i], i);

		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		n1 = new String[n];
		ani = new String[n];
		con = new String[n];
		n2 = new String[n];

		cow = new HashMap<String, pair>();
		cow.put("Bessie", new pair("Ox", 0));

	}

	static void solve() throws IOException {
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			String n1 = st.nextToken();
			st.nextToken();
			st.nextToken();
			String con = st.nextToken();
			String ani = st.nextToken();
			st.nextToken();
			st.nextToken();
			String n2 = st.nextToken();
			
			int a = m.get(cow.get(n2).animal);
			int b = m.get(ani);
			int c = 0;
			
			if(con.equals("previous")) {
				if(b > a) c = (b-a) -12;
				else if(b < a) c = b-a;
				else c = -12;
			}
			else {
				if(b < a) c = (b-a) + 12;
				else if(b > a) c = b-a;
				else c = 12;
			}
			int d = cow.get(n2).ind + c;
			cow.put(n1, new pair(ani, d));
		}
//		System.out.println(cow);
		System.out.println(Math.abs(cow.get("Elsie").ind));

	}

	static class pair {
		String animal;
		int ind;

		pair(String y, int x) {
			animal = y;
			ind = x;
		}

		public String toString() {
			return animal + " " + ind;
		}
	}
}
