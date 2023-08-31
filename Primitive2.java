package dya02;

public class Primitive2 {
	public static void main(String[] args) {
		System.out.println("----실수형----");
		//float(4byte) < double(8byte)<==default
		float ft1=10.123f;
		System.out.println(ft1);
		
		float ft2=2000000000; //promotion 자동형변환, 
							  //upcasting:작은유형에서 큰유형으로자동 형변환
		System.out.println(ft2);
		
		float ft3='A'; //char==>float
				System.out.println(ft3);
				
		float ft4=.856f;
		System.out.println(ft4);
		
		double db1=-796.245;
		double db2=4545.001d;
		System.out.println(db1);
		System.out.println(db2);
		
		double db3=8e-2;
		System.out.println(db3);
		double db4=8e+5;
		System.out.println(db4);
		
		float ft5=900e-3f;
		System.out.println(ft5);
	}
}
