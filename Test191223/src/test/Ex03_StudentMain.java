package test;

public class Ex03_StudentMain {

	public static void main(String[] args) {
		
//	StudentMain 클래스
//	- Student 클래스 객체 생성하여 필드값 출력			
			
	Ex03_Student sm = new Ex03_Student("임현우", "930807", "12-12560", "관광학과");

	System.out.println("이름 : " + sm.name);
	System.out.println("주민번호 : " + sm.number);
	System.out.println("학번 : " + sm.studentNumber);
	System.out.println("학과 : " + sm.major);

	}

}
