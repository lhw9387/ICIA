package test;

public class Ex02_CellPhoneMain {

	public static void main(String[] args) {


//	CellPhone 클래스 객체 선언해서
//	Ex02_CellPhone CellPhone = new Ex02_CellPhone(); // 기본 생성자로 한거
	Ex02_CellPhone cp = new Ex02_CellPhone("123", "갤럭시", "검정");
	
//	부모 클래스 필드 값 출력 // 상속된 부모 클래스의 필드도 사용할 수 있다.
	System.out.println(cp.model); // 결과 값 : 갤럭시
	System.out.println(cp.color); // 결과 값 : 검정
	
//	부모 클래스 메소드 호출 // 상속된 부모 메소드도 사용할 수 있다. 
	cp.hangOn();
	cp.hangOff();
	cp.call("여보세요");
	
//	자식 클래스 필드 값 출력
	System.out.println(cp.button); // 결과 값 : 123
	System.out.println(cp.message); // 결과 값 : null / 객체 선언시 값 입력x
	
//	자식 클래스 메소드 호출	
	cp.sendMessage("123");
	cp.receiveMessage("123");
	cp.powerOn();
	cp.powerOff();
	
	
	}
	
}
