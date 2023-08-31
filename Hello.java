package dya02;//1.패키지 선언문
//2.import 패키지명.클래스명;
/*
import java.lang.System;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
*/
import java.util.*;//임포트 토탈 명령어

//3.클래스 선언문
//public class 클래스명{}
//클래스명: 명사형, 대문자로 시작, camel표기
//클래스명과 파일명은 반드시 같아야함(대소문자포함)
//Hello.java
public class Hello {
	//클래스안에는 main() =>실행프로그램이된다
	public static void main(String[] args) {
		System.out.println("Hello java~");
		Date today =new Date(); //객체생성
		System.out.println(today);
		
		Random ran=new Random();
		int num=ran.nextInt(10);//0<= r <10 사이의 랜덤정수값출력
		System.out.println("num="+num);
		
		System.out.println("당신의이름은?:");
		Scanner sc=new Scanner(System.in);
		//System.in:표준 입력 장치와 연결되어 있다
		//System.out:표준 출력 장치
		String name=sc.next();//문자열 입력받는다
		System.out.println("이름:"+name);
	}//main()-----------------------
}//class-----------------------------
