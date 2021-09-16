package archive;

public class A002 {
	
/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 *  find the sum of the even-valued terms.
 */
	
	public static void main(String[] args) {
		long f0,f1,f2;
		long fsum;
		f0 = fsum = f1 = f2 = 0;
		f1=1;
		
		while(f0<4000000) {
			f0 = f1+f2;
			f2 = f1;
			f1 = f0;
			if (f0%2 ==0) {
				fsum = fsum+f0;							
			}
		}
		System.out.println("fibonnaci sum: "+fsum);		
	}
}
