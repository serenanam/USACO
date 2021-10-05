 /*
ID: serenanam
LANG: JAVA
TASK: gift1
 */

import java.util.*;
import java.io.*;

public class gift1 {

	static Scanner in;
	static PrintWriter out;
	static int NP;
	static Map<String, Integer> group;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("gift1.in"));
		out = new PrintWriter("gift1.out");
		
		init();
		solve();
		
		in.close();
		out.close();

	}
	
	static void init() {
		NP = in.nextInt(); in.nextLine();
		group = new LinkedHashMap<String, Integer>();
		
		for(int i=0; i<NP; i++) {
			group.put(in.nextLine(), 0);
		}
//		System.out.println(group);
	}
	
	static void solve() {
		String giver = "", receiver = "";
		int money = 0, num = 0, gift = 0, rem = 0;
		
		for(int i=0; i<NP; i++) {
			giver = in.nextLine();
			money = in.nextInt();
			num = in.nextInt(); in.nextLine();
			
			if(num == 0) continue; 
			
			gift = money/num;
			rem = money%num;
			group.put(giver, group.get(giver)-money+rem);
			
			for(int j=0; j<num; j++) {
				receiver = in.nextLine();
				group.put(receiver, group.get(receiver)+gift);
			}
			
		}
		
		String ans = "";
		for(String key : group.keySet()) {
			ans += key+ " " + group.get(key) + "\n";
		}
		out.print(ans);
//		System.out.println(group);
		
	}

}
