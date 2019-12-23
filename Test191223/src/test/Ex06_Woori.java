package test;

public class Ex06_Woori extends Ex06_Hankuk{
	
	@Override
	double keum(double money) {
		System.out.println("한국은행 금리 적용 금액 : " + super.keum(money) + "원");
		return money * 1.5;
		
	}
	
	@Override
	void interestRate() {
		System.out.println("우리은행 금리는 1.5입니다.");
	}

}
