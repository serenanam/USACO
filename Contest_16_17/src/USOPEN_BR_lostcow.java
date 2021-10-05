import java.util.*;
import java.io.*;

public class USOPEN_BR_lostcow {
	static Scanner in;
	static PrintWriter out;
	static int x, y;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("lostcow.in"));
		out = new PrintWriter(new FileWriter("lostcow.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		x = in.nextInt();
		y = in.nextInt();
	}

	static void solve() {
		int dist = Math.abs(x-y);
		int start = x;
		int add = 1;
		int dir = 1;
		int ans = 0;
		
		while(true) {
			if(dir%2!=0 && x <= y && x+add >= y || dir%2==0 && x >= y && x-add <= y) {
				ans += Math.abs(x-y);
				break;
			}
			
			else {
				ans += add*2;
				x = start;
				add*=2;
				dir++;
			}	
			
		}
		out.println(ans);
	}

}