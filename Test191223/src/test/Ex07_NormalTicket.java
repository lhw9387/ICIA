package test;

import java.util.Scanner;

public class Ex07_NormalTicket extends Ex07_Ticket  {
	
//	3. NormalTicket 클래스 (Ticket 상속)
//  A. 일반 티켓. 티켓이 발행될 때 티켓번호와 신용카드 결제 여부 정보를 가지고 있음. 
//  B. 신용카드로 결제하는 경우 5% 금액이 가산됨.
	Scanner sc = new Scanner(System.in);
	
	
	void ordinaire () {
		System.out.println("------------------------");
		System.out.println("결제 방법 : 1. 현금 | 2. 카드  ");
		System.out.println("------------------------");
		System.out.print("> 선택 : ");
		int num1 = sc.nextInt();
		if(num1 == 1) {
			System.out.print("현금 티켓 가격 : ");
			int money = sc.nextInt();
			System.out.println(money * 1 + "원");
		} else if(num1 == 2)	{
			System.out.print("카드 티켓 가격 : ");
			int money = sc.nextInt();
			System.out.println(money * 1.05 + "원");
		}
	}

}
