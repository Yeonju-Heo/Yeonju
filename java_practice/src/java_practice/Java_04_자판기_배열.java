package java_practice;

import java.util.Scanner;

public class Java_04_자판기_배열 {

	public static void main(String[] args) {
		String[] menulist = {"아이스 아메리카노","밀크커피","유자차"};
		int[] pricelist = {500,300,200};
		
		//메뉴출력
		System.out.println("***** 커 피 자 판 기 **********");
		for(int i=0;i<menulist.length;i++) {
			System.out.println((i+1)+". "+menulist[i]+"["+pricelist[i]+"]");
		}
		System.out.println("4. 종료");
		System.out.println("***************************");
		
		Scanner scan = new Scanner(System.in);
		int coin=0, menu=0, change=0;
		String quit="";
		String[] orderMenu=new String[3]; //메뉴5개까지 주문
		int count=0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("동전입력>");
			coin += scan.nextInt();
			System.out.println("coin---->" + coin);
			System.out.println("change---->" + change);
			
			if(coin>=pricelist[pricelist.length-1]) {
				//주문가능 메뉴 출력
				/*
				if(coin>=400) {
					System.out.println("주문가능 메뉴---> 아메리카노,밀크커피,유자차");
				}else if(coin<400 && coin>=300) {
					System.out.println("주문가능 메뉴---> 밀크커피,유자차");					
				}else if(coin<300 && coin>=200) {
					System.out.println("주문가능 메뉴---> 유자차");
				}*/

				boolean menu_flag = true;
				while(menu_flag) {
					//메뉴선택				
					System.out.print("메뉴선택(번호)>");
					menu = scan.nextInt();
					
					switch(menu) {
						case 1:
							orderMenu[count] = menulist[0];
							change = coin - pricelist[0];
							break;
						case 2:
							orderMenu[count] = menulist[1];
							change = coin-pricelist[1];
							break;
						case 3:
							orderMenu[count] = menulist[2];
							change = coin-pricelist[2];
							break;
						case 4:
							System.out.print("정말로 종료하시겠습니까(y/n)>");
							quit = scan.next();
							if(quit.equals("y")) flag = false;
							break;
						default:
							System.out.println("메뉴 준비중");				
					}//switch
					
					//주문결과(메뉴,잔돈) 출력
					System.out.println("--- 주문이 완료 되었습니다. ---");
					count++;
					
					//System.out.println("coin---->" + coin);
					System.out.println("change---->" + change);
					
					//잔돈이 최소주문 금액(200) 보다 크면 --> 추가 주문 가능, 작으면 --> 주문내역 출력
					if(count < orderMenu.length) {
						if(change>=pricelist[pricelist.length-1]) {						
							System.out.print("추가주문 하시겠습니까(y/n)>");
							String order = scan.next();
							if(order.equals("y")) {
								//추가주문---> 메뉴 선택 반복
								coin = change;
							}else {
								//추가주문 안함
								menu_flag = false;
							}
						}else {
							//잔돈 부족
							menu_flag = false;
						}
					}else {
						System.out.println("최대 주문 갯수는 "+orderMenu.length+"개까지 입니다.");
						menu_flag = false;
					}
					
				}//while(menu_flag)
				
				for(String omenu : orderMenu) {
					if(omenu != null)
						System.out.println("주문메뉴--->" + omenu);
				}
				System.out.println("잔돈--->" + change);	
				//menu_flag = false;
				flag = false;				
			
			}else {
				//금액 부족
				System.out.println("금액이 부족합니다. 동전을 입력해주세요.");
			}
		}//while
	
		System.out.println(" +++++++++   프로그램 종료       ++++++++++");
		
	}//main

}//class