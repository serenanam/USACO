 /*
ID: serenanam
LANG: JAVA
TASK: friday
 */

import java.util.*;
import java.io.*;
public class friday {

	static Scanner in;
	static PrintWriter out;
	static int[] date, ans;
	static int n, day;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("friday.in"));
		out = new PrintWriter("friday.out");
		
		date = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		ans = new int[7];
		day = 13;
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		n = in.nextInt();
	}
	
	static void solve() {
		for(int year=1900; year<1900+n; year++) {
			for(int month=1; month<= 12; month++) {
				ans[day%7]++;
				day+= date[month];
				if(month == 2 && isLeap(year)) {
					day++;
				}
			}
		}
		out.print(ans[6]);
		for(int i=0; i<ans.length-1; i++) {
			out.print(" " + ans[i]);
		}
		out.println();
		
	}
	
	static boolean isLeap(int yr) {
		if(yr%4==0) {
			if(yr%400==0) return true;
			if(yr%100==0) return false;
			else return true;
		}
		return false;
	}

}
