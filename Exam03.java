package dya02;
import java.util.*;
public class Exam03 {

	public static void main(String[] args) {
		System.out.println("반지름을 입력하세요");
		Scanner sc=new Scanner(System.in);
		String rrr=sc.next();
		float a1=Integer.parseInt(rrr);
			float pi=3.14f;
			float si=pi*a1*a1;
			
		System.out.printf("원의 면적은:%.2f",si);

	}

}
