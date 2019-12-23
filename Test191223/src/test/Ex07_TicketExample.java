package test;

import java.util.Scanner;

public class Ex07_TicketExample {

	public static void main(String[] args) {

	Ex07_BookingTicket bt = new Ex07_BookingTicket();
	Ex07_NormalTicket nt = new Ex07_NormalTicket();

	Scanner sc = new Scanner(System.in);
	
//	4. TicketExample 클래스 
//  A. 사전예약 티켓, 일반 예매 티켓을 각각 객체로 만들어서 
//     각 티켓의 티켓번호, 구매가격을 출력하시오. 

	
	System.out.println("--------------------------");
	System.out.println("1.사전 예약 티켓 | 2. 일반 예매 티켓"); 
	System.out.println("--------------------------");
	System.out.print("> 선택 : ");
	int num1 = sc.nextInt();
	if(num1 == 1) {
		bt.reservation();
	} else if(num1 == 2) {
		nt.ordinaire();
	}
	
	}

}
