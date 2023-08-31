package dya02;
import java.util.*;
public class MyDemo {	
		//1.단문주석
		/*2.복문주석
		* 여러라인주석
		*/
		/**
		 * 3.문서화주석
		 */
		//  javadoc을 이용하면 api문서를 만들어준다.
	
	//public:접근 지정자(access modifier)<=>private
	//static:클래스 지정자(class modifier)
	//void : 반환값이 없다는 의미
	public static void main(String[] args) {
		System.out.println("my demo!");
		System.out.print("안녕 자바\n");
		System.out.print("반가워 ");
		System.out.print("난 임명장이야");
		/*escape 문자
		 * \n : 개행문자 (줄바꿈이 일어난다)
		 * \t : 탭 키 만큼 띄어쓰기를 한다
		 * \" : 쌍따옴표를 출력하고자 할 때 사용
		 * \' : 홑따옴표
		 * \\ : 역슬래시(\)를 출력하고자 할때
		 * \r : 캐리지리턴. 커서를 맨 앞으로 이동시킨다
		 * */
		//syso + Ctrl+spacebar
		System.out.println("\n-------------------");
		System.out.println("국어\t영어\t수학");
		System.out.println("98\t87\t65\t");
		System.out.println("-------------------");
		System.out.println("김소월 님의 '진달래꽃'");
		System.out.println("\"나보기가 역겨워 가실 때에는...\"");		
		System.out.println("***************");
		System.out.printf("출력서식, 출력할내용들...");
		//출력서실: %지시사
		/* %d : 정수형식으로 출력
		 * %f : 소수점 형식으로 출력
		 * %s : 문자열 형식으로 출력
		 * %b : boolean형식으로 출력
		 * %n : 줄바꿈
		 * */		
		System.out.printf("제 이름은 %s이고 나이는 %d세 입니다%n","홍길동",22);
		String name="김철수";
		int age=27;
		System.out.println("\n제 이름은 "+name+"이고 나이는 "+age+"세 입니다");

		System.out.printf("\n제 평균성적은 %f점 입니다\n",93.551234);
		System.out.printf("평균성직 : %.3f점%n", 93.551234);
		System.out.printf("%4d%n", 1);//4자리를 차지하고 1을 출력
		System.out.printf("%4d%n", 10);//4자리를 차지하고 1을 출력
		System.out.printf("%4d%n", 100);//4자리를 차지하고 1을 출력
		//-를 사용하면 왼쪽 정렬이 된다
		System.out.printf("%-4d%n", 1);//4자리를 차지하고 1을 출력
		System.out.printf("%-4d%n", 10);//4자리를 차지하고 1을 출력
		System.out.printf("%-4d%n", 100);//4자리를 차지하고 1을 출력
		//0을 이용하면 오른쪽 정렬을 하면서 남은 공간의 왼쪽 자리는 0으로 채운다
		System.out.printf("%04d%n", 100);
		//4자리를 차지하고 100을 출력하고 앞에 남은 공간을 0으로 채운다
	}
}
