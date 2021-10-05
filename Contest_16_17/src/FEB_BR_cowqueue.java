import java.util.*;
import java.io.*;

public class FEB_BR_cowqueue {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static pair a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("cowqueue.in"));
		out = new PrintWriter(new FileWriter("cowqueue.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new pair[N];
		for(int i=0; i<N; i++) {
			a[i] = new pair(in.nextInt(), in.nextInt());
		}
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
	}

	static void solve() {
		int arrive = 0;
		int time = 0;
		int end = 0;
		for(int i=0; i<N; i++) {
			arrive = a[i].arrive;
			time = a[i].answer;
			
			if(end > arrive) {
				end += time;
			}
			else {
				end = arrive + time;
			}
		}
		out.println(end);
	}
	
}

class pair implements Comparable<pair>{
	int arrive;
	int answer;
	pair(int a, int b) {
		arrive = a;
		answer = b;
	}
	@Override
	public int compareTo(pair that) {
		return this.arrive - that.arrive;
	}
	
	public String toString() {
		return arrive + " " + answer;
	}
	
	
}
