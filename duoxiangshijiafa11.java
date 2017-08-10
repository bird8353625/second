package hello;

import java.util.Scanner;

public class duoxiangshijiafa11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in); 
        int[] a = new int[100];
        int x = 0,y = 0,z = 0,max = 0;
        while(z != 2){
        	x = in.nextInt();
        	y = in.nextInt();
        	a[x] += y;
        	if(x >max){
        		max = x;
        	}
        	if(x == 0){
        		z++;
        	}
        }
        for(int i = max;i>=0;i--){
        	if(a[i]> 0){
        		if(i > 0){
        			System.out.print(a[i] + "x" + i + "+");
        		}
        		else{
        			System.out.print(a[i]);
        		}
        	}
        }
       
	}
}
