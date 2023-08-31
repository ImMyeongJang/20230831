package dya02;
import javax.swing.JOptionPane;
public class Exam01 {

	public static void main(String[] args) {
		//ppt150page 문제풀이
		String age=JOptionPane.showInputDialog("당신의 나이는?");
		if(age==null) {
			return;//아래 문장을 실행하지않음
		}
//		if(age=="") { //주소값 비교
//			return;
		if(age.equals("")) {
			System.out.println("나이를 입력해야죠");
		}
		System.out.println(age+"세 이군요!!");
		int age_int=Integer.parseInt(age);
		System.out.printf("**내년에는 %d세 이겠네요~~**", age_int+1);
	}

}
