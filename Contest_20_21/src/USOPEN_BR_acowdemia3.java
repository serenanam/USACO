import java.util.*;
import java.io.*;

public class USOPEN_BR_acowdemia3 {
	static Scanner in;
	static int N, M;
	static char[][] a;
	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		a = new char[N][M];
		for(int i=0; i<N; i++) {
			a[i] = in.next().toCharArray();
		}

		System.out.println(Arrays.deepToString(a));
	}

	static void solve() {
		for(int x=0; x<N; x++) {
			for(int y=0; y<M; y++) {
				if(a[x][y] == 'C') {
					if(a[x][y+2] == 'C') {
						
					}
					else if(a[x][y-2] == 'C') {
						
					}
					else if(a[x+2][y] == 'C') {
						
					}
					else if(a[x-2][y] == 'C') {
						
					}
				}
			}
		}
	}

}

