
import java.util.*;
import java.io.*;

public class DEC_BR_square {
	static Scanner in;
	static PrintWriter out;
	static int x1, x2, y1, y2, x3, x4, y3, y4, lcx, lcy, rcx, rcy, subx, suby ;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("square.in"));
		out = new PrintWriter(new FileWriter("square.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		x3 = in.nextInt();
		y3 = in.nextInt();
		x4 = in.nextInt();
		y4 = in.nextInt();
	}

	static void solve() {
		if(x1 <= x3) lcx = x1;
		else lcx = x3;
		
		if(y1 <= y3) lcy = y1;
		else lcy = y3;
		
		if(x2 >= x4) rcx = x2;
		else rcx = x4;
		
		if(y2 >= y4) rcy = y2;
		else rcy = y4;
		
		subx = rcx - lcx;
		suby = rcy - lcy;
		
		if(suby >= subx) out.println(suby * suby);
		else out.println(subx * subx);
		
		
	}

}


