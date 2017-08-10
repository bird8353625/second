package hello;

import java.util.Scanner;

public class Jinjiepian11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in); 
	       String s = new String();
	       s = in.nextLine();
	       String[] a = s.split(" ");
	       int i;
	       for(i = 0;i< a.length-1;i++){
	    	   if(a[i].length() != 0){
	    		   System.out.print(a[i].length() + " ");
	    	   }
	       }
	       if(a[i].length() != 1){
	    	   System.out.print(a[i].length() -1);
	       }
	}

}
