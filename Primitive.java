package dya02;

public class Primitive {
	public static void main(String[] args) {
		System.out.println("---Primitive Type---");
		//1.정수형
		//byte < short < int < long
		byte bt1=127;
		byte bt2=-128;
		System.out.println(bt1+bt2);
		
		short st=128;
		System.out.println(st);
		short st1=-32767;
		System.out.println(st1);
		
		int it=500000;
		long ln1=50;
		long ln2=50L;
		System.out.printf("\nit=%d",it);
		System.out.printf("\nln1=%d",ln1);
		System.out.printf("\nln2=%d\n",ln2);
		
		int i=1000000000;
		long j=10000000000L;
		System.out.printf("i=%d%n",i);
		System.out.printf("j=%d%n",j);
		
		int a=010;//8진수 정수. 8진수는 앞에 '0'을 붙인다
		int b=0x1af;//16진수. 16진수는 앞에 '0x'를 붙인다
		
		System.out.println(a);
		System.out.println(b);
		
		int c=0217;
		System.out.println(c);
	}
}
