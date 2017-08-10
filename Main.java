package hello;

import java.util.HashMap;
import java.util.Scanner;


	public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> a = new HashMap<String,Integer>();
		int n = 0;
		while(true){
			String s = in.next();
			if(s.equals("###")){
				break;
			}else{
				
				a.put(s, n);
				n++;
			}
		}
		
		
		int[][] b = new int[n][n];
		for(int i= 0 ;i<a.size();i++){
			for(int j= 0 ;j<a.size();j++){
				b[i][j]= in.nextInt();
			}
		}
		
		String x = in.next();
		String y = in.next();
		
		System.out.println(b[a.get(x)][a.get(y)]);
	}

}
