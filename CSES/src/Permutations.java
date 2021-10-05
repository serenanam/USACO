import java.util.*;
import java.io.*;

public class Permutations {
	static Scanner in;
	static int n, a[], ans[], even[], odd[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		n = in.nextInt();
		a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = i+1;
		}
		
	}

	static void solve() {
		int ecnt = 0;
		int ocnt = 0;
		even = new int[n];
		odd = new int[n];

		if(n == 2 || n == 3) System.out.println("NO SOLUTION");
		
		else {
			for(int i=0; i<n; i++) {
				if(a[i]%2 == 0) {
					even[ecnt] = a[i];
					ecnt++;
				}
				else {
					odd[ocnt] = a[i];
					ocnt++;
				}
			}
			
			for(int i=0; i<ecnt; i++) System.out.print(even[i] + " ");
			for(int i=0; i<ocnt; i++) System.out.print(odd[i] + " ");
		}
		
	}

}
