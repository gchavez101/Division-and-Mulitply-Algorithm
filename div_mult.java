import java.util.*;

public class div_mult{

	/*
	if x = 0: 
	return (q,r) = (0,0) 
	(q, r) = divide(⌊x/2⌋, y)
	q=2·q, 
	r=2·r
	if x is odd: r=r+1 
	if r≥y: r=r−y, q=q+1 
	return (q, r)*/
	

	public static int[] division(int x, int y){
		int q, r;
		if(x == 0){
			q=0;
			r=0;
			return new int[] {q,r};
		}

		q = (x/2) / y;
		r = (x/2) % y;
		q=2*q;
		r=2*r;
		if((x % 2) != 0)
			r=r+1;
		if(r>=y){
			r=r-y;
			q=q+1;
		}
		return new int[] {q,r};
	}
	/*function multiply(x, y)
	Input: Two n-bit integers x and y, where y ≥ 0 
	Output: Their product
	if y=0: 
		return 0 
	z = multiply(x, ⌊y/2⌋) 
	if y is even:
		return 2z else:
	return x + 2z*/

	public static int multiply(int x, int y){
		int z=0;
		if(y==0)
			return 0;
		z=(x*(y/2));
		if((x%2)==0)
			return 2*z;
		return (x+2*z);
	}


	public static void main(String[] args){

		System.out.println(Arrays.toString(division(1250,100)));
		System.out.println(multiply(10,10));

	}

}//end of division