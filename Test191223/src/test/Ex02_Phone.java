package test;

public class Ex02_Phone { // 부모 클래스

//	필드 선언
	String model;
	String color;

	
	@Override
	public String toString() {
		return "Ex02_Phone [model=" + model + ", color=" + color + "]";
	}
	
	
//	메소드 선언(전화 걸기, 전화 끊기, 통화)
	void hangOn() {
		System.out.println("전화를 겁니다.");
	}
		

	void hangOff() {
		System.out.println("전화를 끊습니다.");
	}
		
	void call(String sendVoice) {
		System.out.println("통화를 합니다."); 
	}
	
//	
}
