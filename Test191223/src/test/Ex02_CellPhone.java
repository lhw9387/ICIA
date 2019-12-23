package test;

public class Ex02_CellPhone extends Ex02_Phone {
//	상속방법 : Ex02_CellPhone(자식 클래스) + extends + Ex02_Phone(부모 클래스)
	
	String button;
	String message;	

@Override
	public String toString() {
		return "Ex02_CellPhone [button=" + button + ", message=" + message + "]";
	}


	// 	생성자
//	button, model, color를 매개변수로 하는 생성자 선언	
//	Ex02_Phone 에서 선언한 필드 매개변수를 사용
	Ex02_CellPhone() {
		
	}
	
	
	Ex02_CellPhone(String button, String model, String color) {
		this.button = button;
		this.model = model;
		this.color = color;
	}
	
	
//	메소드
	void sendMessage(String message) {
		System.out.println("메세지 전송 : " + message);
	}
	
	void receiveMessage(String message) {
		System.out.println("메세지 수신 : " + message);
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
