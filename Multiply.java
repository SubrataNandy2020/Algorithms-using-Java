import java.util.*;
class Multiply{
	public static int counter=0;
	public static long go(long x, long y){
		if(x < 10 || y < 10) {
			counter+=1;
System.out.println(counter);
			return x*y;
		}
		int maxBase = (int) Math.max(Math.log10(x), Math.log10(y)) + 1;
		int halfMax = (maxBase/2) + (maxBase%2);
		System.out.println("HalfMax"+halfMax);
    	long a = x / (int) Math.pow(10, halfMax);
		System.out.println("a:"+a);
		long b = x % (int) Math.pow(10, halfMax);
		System.out.println("b:"+b);
    	long c = y / (int) Math.pow(10, halfMax);
		System.out.println("c:"+c);
		long d = y % (int) Math.pow(10, halfMax);
		System.out.println("d:"+d);
		
		long ac =go(a, c);
		System.out.println("ac:"+ac);
		//counter++;
		long bd =go(b, d);
		System.out.println("bd:"+bd);
		//counter++;
		long abcd =go((a+b), (c+d));
		System.out.println("abcd:"+abcd);
		//counter++;
		abcd=abcd-ac-bd;
		//System.out.println("abcd:"+abcd);
		
		return (long) ((ac*Math.pow(10, (2*halfMax))) + (abcd*Math.pow(10, halfMax)) + bd);
	}
public static void main(String[] ags){
Scanner sc=new Scanner(System.in);
Multiply kl=new Multiply();
System.out.println("Enter 2 no.s:");
long m=sc.nextLong();
long n=sc.nextLong();
long mul=kl.go(m,n);
System.out.println("*************************************************************************");
System.out.println("Counter:"+counter);
System.out.println("Answer is:"+m+"*"+n+"="+mul);
}
}