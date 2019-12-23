package test;

public class Ex05_ComputerMain {

	public static void main(String[] args) {
	
	Ex05_Computer pc = new Ex05_Computer();
	
	System.out.println(pc.Calculaion(2, 4)); // Ex05_Computer 메소드가 호출 됨.
	
// 부모 클래스가 나오게할려면 아래내용을 Ex05_Computer 클래스에 입력해야 됨.
	
//	@Override
//	int Calculaion(int num1, int num2) {
//	부모 클래스의 메소드 호출(재정의 되지 않는)
// 	부모 클래스
//		System.out.println(super.Calculaion(num1, num2));

//	자식 클래스		
//		System.out.println("Computer(자식) Calculation의 메소드 호출");
//			return (num1 + num2) / 2; // return 다음에 오는 코드는 죽은 코드
//	} 	
	

	}

}
