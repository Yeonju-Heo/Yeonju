package java_practice;

import java.util.Scanner;

public class java_02_버거선택 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("★★★★★★★ 집게리아 메뉴판 ★★★★★★★");
		System.out.println("1)게살버거  2)맛살버거  3)콜라  4)종료");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println();		

		
		boolean flag = true;
		
		while(flag) {
			
			System.out.print("원하는 메뉴를 입력하세요(번호)> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("게살버거 5천원입니다.");
				boolean insert = true;
				while(insert) { 
				System.out.print("투입금액 입력: ");
				int price = scan.nextInt();
				if(price>=5000) {
				System.out.println("게살버거 주문 완료!");
				insert = false;
				}else {
					System.out.println("금액이 부족합니다. 다시 넣어주세요.");
				}}
				break;
			case 2:
				System.out.println("맛살버거 주문 완료!");
				break;
			case 3:
				System.out.println("콜라 주문 완료!");
				break;
			case 4:
				System.out.print("종료하시겠습니까?(y/n)> ");
				String choice = scan.next();
				if(choice.equals("y")) flag = false;
				break; 
			default:
				System.out.println("메뉴 준비중입니다.");
			}
		
		
		}
		
		System.out.println("안녕히 가세요!");

		
	}

}
