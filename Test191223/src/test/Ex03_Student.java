package test;

public class Ex03_Student extends Ex03_People { 
// Ex03_People 클래스가 Ex03_Student 클래스에게 상속

//	Student 클래스
//	- People 상속
//	- 학번, 학과 필드
//	- 이름, 주민번호, 학번, 학과를 매개변수로 하는 생성자	
	
	String studentNumber;
	String major;
	
	
	public Ex03_Student(String name, String number, String studentNumber, String major) {
//		this.name = name; // 부모 클래스 껀 this. 로는 사용이 불가능함.
//		this.number = number;
		super(name, number); // super : 부모클래스의 생성자
		this.studentNumber = studentNumber;
		this.major = major;
	}
	

}
