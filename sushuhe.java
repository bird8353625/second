package hello;

import java.util.Scanner;

public class sushuhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in); 
       int n = in.nextInt();
       int m = in.nextInt();
       int num = 2;
       int count = 1;
       int sum = 0;
	   if(m != n){while(count != n){
	    	   num += 1;
	    	   for(int i = 2;i < num;i++ ){
	    		   if(num%i == 0){
	    			   num += 1;
	    			   i = 2;
	    		   }
	    	   }
	    	   count += 1;
	       }
	       sum = sum + num;
	       do{
	    	   num += 1;
	    	   for(int i = 2;i < num;i++ ){
	    		   if(num%i == 0){
	    			   num += 1;
	    			   i = 2;
	    		   }
	    	   }
	    	   count += 1;
	    	   sum += num;
	       }while(count != m);
	       }else if(m == n){
		   while(count != n){
	    	   num += 1;
	    	   for(int i = 2;i < num;i++ ){
	    		   if(num%i == 0){
	    			   num += 1;
	    			   i = 2;
	    		   }
	    	   }
	    	   count += 1;
	       }
	       sum = sum + num;
	   }
       System.out.println(sum);
          
	   
	}

}
