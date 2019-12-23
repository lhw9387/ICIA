package test;

public class Ex06_Kukmin extends Ex06_Woori{

	@Override
	double keum(double money) {
		System.out.println("우리은행 금리 적용 금액 : " + super.keum(money) + "원");
		return money * 1.6;
		
	}
	
	@Override
	void interestRate() {
		System.out.println("국민은행 금리는 1.6입니다.");
	}
	
}
