import java.util.*;
import java.io.*;

public class JAN_BR_notlast {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static HashMap<String, Integer> cows;
	static int ans;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("notlast.in"));
		out = new PrintWriter(new FileWriter("notlast.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		cows = new HashMap<String, Integer>();
		cows.put("Bessie", 0);
		cows.put("Maggie", 0);
		cows.put("Elsie", 0);
		cows.put("Henrietta", 0);
		cows.put("Annabelle", 0);
		cows.put("Daisy", 0);
		cows.put("Gertie", 0);

		for(int i=0; i<N; i++) {
			String name = in.next();
			int milk = in.nextInt();
			cows.put(name,  cows.get(name) + milk);
		}
	}

	static void solve() {
		TreeSet<Integer> milk = new TreeSet<Integer>();
		milk.addAll(cows.values());

		ArrayList<Integer> milk2 = new ArrayList<Integer>();
		milk2.addAll(milk);

		if(milk2.size() == 1) {
			out.println("Tie");
		}
		else {
			int sec = milk2.get(1);
			ArrayList<String> ans = new ArrayList<String>();
			for(String key: cows.keySet()) {
				if(cows.get(key) == milk2.get(1)) {
					ans.add(key);
				}
			}
			if(ans.size() > 1) out.println("Tie");
			else if(ans.size() == 1) out.println(ans.get(0));
		}
	}

}