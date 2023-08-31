package dya02;

public class Primitive3 {
	public static void main(String[] args) {
		System.out.println("문자형------");
		//char문자형(2byte 0~655535):유니코드체계를 사용(모든국가언어표현가능)
	    char c1='가';
	    char c2='申';
	    char c3='\uff57';//유니코드
	    System.out.println(c1+""+c2);
	    System.out.println(c2);
	    System.out.println(c3);
	    
	    //문자 유형은 연산에 사용되면 자동으로 int형으로 형변환된다.
	    /* char + int ==>int
	     * char + char ==>int
	     * int보다 작은 유형의 데이터가 연산에 사용될 경우
	     * 자동으로 int유형으로 형변환된다.
	     * byte-----+
	     * short----+==>int
	     * char-----+
	     * 
	     */
	    System.out.println(c1+1);
	    System.out.println((char)(c1+1));//강제 형변환
	    //자료형=(자료형)값
	    //casting연산자 ()를 이용
	    
	    byte b4=(byte)128; //강제형변환 데이터손실 -128출력
	    System.out.println(b4);
	    
	    System.out.println("---논리형----------");
	    //boolean (1byte): true, false값만 갖는다.
	    boolean bool=true;
	    boolean bool2=2>5;
	    System.out.println("bool="+bool);
	    System.out.println("bools="+bool2);
	    //자바의 논리형은 형변환 불가능, 0이나 1로 호환되지 않는다.
	    
	    int $$__=10;
	    int _a1$_$1=5;
	    //문자 사용불가능 숫자 앞에 불가능, 에외 $, _ 
	    
	}
}
