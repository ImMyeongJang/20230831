package dya02;

public class Operator {
	public static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Operator.print("---연산자----");
		print("1---산술 연산자");
		//+-*/%
		int a=5;
		int b=2;
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a+b);
		System.out.println(a%b);
		
		int x=50;
		long y=2;
		long z=x*y;
		double k=x*y;
		System.out.println(z);
		System.out.println(k);
		
		System.out.println("--2.증감연산자 (++,--)---");
		int c=8;
		int d=5;
		c++; //c=c+1
		print("c:"+c);
		--d;//4
		print("d:"+d); //앞에오든 뒤에오든 단일로 쓰이면 상관없음

		float e=5.6f;
		double f=8.5f;
		System.out.println(++e);//6.6
		System.out.println(e++);//6.6
		//7.6
		System.out.println("e: "+e);
		System.out.println("e: "+e);
		System.out.println(--f);//감소후 연산
		System.out.println(f--);//연산후 감소 그래서 그다음출력때 1감소
		System.out.println("f: "+f);
		
		System.out.println("---3.논리부정 연산자(!)---");
		//!:논리값, 논리식에만 사용된다 true=>false, false=>true
		boolean b1=false;
		print("b1: "+b1);
		print("!b1: "+!b1);
		
		print("--4비교연산자 (==,!=,>,<,>=,<=)---");
		/* = : 대입연산자
		 * == : 비교연산자 
		 * ===: 자바에는 없다[x]
		 * 비교연산자(==)
		 * [1] 기본자료형 : 값이 같은지를 비교함ㅈ
		 * [2] 참조형 : 주소값이 같은지를 비교한다
		 * 
		 * != : 값이 서로 다른가? 다르면 true
		 * */
		int h=7;
		float t=7.0f;
		
		String s1="Hello";
		String s4="Hello";
		String s2=new String("Hello");
		String s3=new String("Hello");
		print("h==t: "+(h==t)); //true 값을 비교
		print("s1==s2: "+(s1==s3));//false 주소값을 비교
		print("s1==s2: "+(s1==s4));
		
		//문자열내용비교:String의 equals()메서드 이용
		print("s2.equals(s4): "+(s2.equals(s4)));
		
		//!= (값이 다른가?, 주소값이 다른가?)
		print("t !=h:"+(t !=h));
		print("s2!=s4:"+(s2!=s4));
	}
}
