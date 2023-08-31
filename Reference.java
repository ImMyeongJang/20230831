package dya02;
import java.util.*;
/* Reference Type (참조형)
 *  [1] 클래스형
 *  [2] 인터페이스형
 *  [3] 배열
 *  - 참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다.
 *    다만 예외는 있다. String의 경우 자주 사용하기 때문에
 *    기본자료형처럼 문자열값(literal)을 직접 할당하도록 하고 있다.
 *    Integer, Float, Double,Character
 * */

public class Reference {
	public static void main(String[] args) {
		Date d=new Date();
		//d는 참조형 변수, 타입은 클래스형
		System.out.println(d);
		Object obj=new Object();
		System.out.println(obj);
		
		String str=new String("Hello");
		System.out.println(str);
		String str2="java";
		System.out.println(str2);
		
		int a=10;//기본자료형
		Integer b=20;
		System.out.println(a+"  "+b);
		
		System.out.println("합="+(a+b));
		System.out.println("합="+a+b);
		System.out.println(a+b+"=합");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//객체=속성+행동양식
		//    변수+메서드
		
		
	}

}
