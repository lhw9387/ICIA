package test;

import java.util.Scanner;

public class Ex07_BookingTicket extends Ex07_Ticket {
	
//	2. BookingTicket 클래스 (Ticket 상속)
//  A. 사전예약 티켓. 티켓 번호와 사전예약 일수 정보를 가지고 있음. 
//  B. 언제 예매를 했느냐에 따라 가격이 달라짐. 
//  i. 30일 전 : 50% 할인
//  ii.10일 전 : 20% 할인
//  iii.5일 전 : 10% 할인 
	
	Scanner sc = new Scanner(System.in);
	
	int day;
	
	void reservation() {
		System.out.print("티켓 가격(원) : ");
		int money = sc.nextInt();
		System.out.print("구매 시점(일) : ");
		int day1 = sc.nextInt();
		if(day1 >= 30) {
			System.out.println("30일 전 : 50% 할인 적용 금액 : " + (money * 0.5) + "원");
		} else if(day1 >= 10) {
			System.out.println("10일 전 : 20% 할인 적용 금액 : " + (money * 0.8) + "원"); 
		} else if(day1 >= 5) {
			System.out.println("5일 전 : 10% 할인 적용 금액 : " + (money * 0.9) + "원");
		}
	}
}
