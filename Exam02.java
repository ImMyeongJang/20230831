package dya02;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String a1=JOptionPane.showInputDialog("1학기 체육성적 입력");
		String a2=JOptionPane.showInputDialog("1학기 수학성적 입력");
		String a3=JOptionPane.showInputDialog("1학기 영어성적 입력");
		String a4=JOptionPane.showInputDialog("1학기 국어성적 입력");
		
		if(a1 == null) {
			System.out.println("no way");
			return;
		 }
		 if(a2 == null) {
			System.out.println("no way");
			return;
		 }
		 if(a3 == null) {
			System.out.println("no way");
			return;
		 }
		 if(a4 == null) {
			System.out.println("no way");
			return;
		 }
		 int a1_int=Integer.parseInt(a1);
		 int a2_int=Integer.parseInt(a2);
		 int a3_int=Integer.parseInt(a3);
		 int a4_int=Integer.parseInt(a4);
		float a5=(a1_int+a2_int+a3_int+a4_int)/4;
		System.out.println(a5);
	}

}
//String age=JOptionPane.showInputDialog("당신의 나이는?");
//if(age==null) {
//	return;//아래 문장을 실행하지않음
//}
////if(age=="") { //주소값 비교
////	return;
//if(age.equals("")) {
//	System.out.println("나이를 입력해야죠");
//}
//System.out.println(age+"세 이군요!!");
//int age_int=Integer.parseInt(age);
//System.out.printf("**내년에는 %d세 이겠네요~~**", age_int+1);