package test;

public class Ex06_Hana extends Ex06_Kukmin{

	@Override
	double keum(double money) {
		System.out.println("국민은행 금리 적용 금액 : " + super.keum(money) + "원");
		System.out.print("하나은행 금리 적용 금액 : ");
		return money * 1.4;
		
	}
	
	@Override
	void interestRate() {
		System.out.println("하나은행 금리는 1.4입니다.");
	}
	
}
