import java.util.*;
import java.io.*;

public class JAN_BR_sleepy {
	static Scanner in;
	static PrintWriter out;
	static int N; 
	static ArrayList<Integer> a;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("sleepy.in"));
		out = new PrintWriter(new FileWriter("sleepy.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			a.add(in.nextInt());
		}
	}

	static void solve() {
		int temp = 0;
		int cnt = 0;
		for(int i: a) {
			System.out.print(i + " ");
		}
		
		
		
		
//		for(int i=0; i<N; i++) {
//			if(a[i] > a[i+1]) {
//				if(a[i] == N-1) {
//					
//				}
//				else {
//					for(int j=0; j<N; j++) {
//
//						if(a[j] - a[i] == 1) {
//
//						}
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
	}

}