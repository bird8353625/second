package hello;

import java.util.Scanner;

 class Fraction {
	private int x;
	private int y;
	
	Fraction(int a, int b){
		x =a;
		y = b;
	}
	
	double toDouble(){
		return (double)x/y;
	}
	
	public Fraction plus(Fraction r){
		int fenzi = x*r.y + y*r.x;
		int fenmu = y*r.y;
	    return new Fraction(fenzi,fenmu);
	}
	
	public Fraction multiply(Fraction r){
		int fenzi = x*r.x;
		int fenmu = y*r.y;
	    return new Fraction(fenzi,fenmu);
	}
	
	void print(){
		simplify();
		if(x == 1 && y == 1){
			System.out.println("1");
		}
		else{
			System.out.println(x + "/" + y);
		}
	}
	
	int gcd(int a,int b){
		while(b != 0){
			int t = a%b;
			a=b;
			b=t;
		}
		return a;
	}
	
	void simplify(){
		int gcd = gcd(x,y);
		if(gcd != 1){
			x = x/gcd;
			y = y/gcd;
		}
	}
}
public class Fraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
