package test;

public class Ex05_Computer extends Ex05_Calculator {
// 상속

// 리턴타입이 int인 Calculation 메소드 정의
// 매개변수는 정수 2개, 정수 2개의 평균값을 리턴
// Override 부모 클래스에 있는 동일한 이름의 Calculaion이라도 리턴값이 다른 경우 / 메소드 재정의
// @ : Annotation (어노테이션)
	
	@Override
	int Calculaion(int num1, int num2) {
//	부모 클래스의 메소드 호출(재정의 되지 않는)
// 	부모 클래스
		System.out.println(super.Calculaion(num1, num2));

//	자식 클래스		
		System.out.println("Computer(자식) Calculation의 메소드 호출");
			return (num1 + num2) / 2; // return 다음에 오는 코드는 죽은 코드
	} 
	
	
}
