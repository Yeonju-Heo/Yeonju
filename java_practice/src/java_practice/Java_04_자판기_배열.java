package java_practice;

import java.util.Scanner;

public class Java_04_���Ǳ�_�迭 {

	public static void main(String[] args) {
		String[] menulist = {"���̽� �Ƹ޸�ī��","��ũĿ��","������"};
		int[] pricelist = {500,300,200};
		
		//�޴����
		System.out.println("***** Ŀ �� �� �� �� **********");
		for(int i=0;i<menulist.length;i++) {
			System.out.println((i+1)+". "+menulist[i]+"["+pricelist[i]+"]");
		}
		System.out.println("4. ����");
		System.out.println("***************************");
		
		Scanner scan = new Scanner(System.in);
		int coin=0, menu=0, change=0;
		String quit="";
		String[] orderMenu=new String[3]; //�޴�5������ �ֹ�
		int count=0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("�����Է�>");
			coin += scan.nextInt();
			System.out.println("coin---->" + coin);
			System.out.println("change---->" + change);
			
			if(coin>=pricelist[pricelist.length-1]) {
				//�ֹ����� �޴� ���
				/*
				if(coin>=400) {
					System.out.println("�ֹ����� �޴�---> �Ƹ޸�ī��,��ũĿ��,������");
				}else if(coin<400 && coin>=300) {
					System.out.println("�ֹ����� �޴�---> ��ũĿ��,������");					
				}else if(coin<300 && coin>=200) {
					System.out.println("�ֹ����� �޴�---> ������");
				}*/

				boolean menu_flag = true;
				while(menu_flag) {
					//�޴�����				
					System.out.print("�޴�����(��ȣ)>");
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
							System.out.print("������ �����Ͻðڽ��ϱ�(y/n)>");
							quit = scan.next();
							if(quit.equals("y")) flag = false;
							break;
						default:
							System.out.println("�޴� �غ���");				
					}//switch
					
					//�ֹ����(�޴�,�ܵ�) ���
					System.out.println("--- �ֹ��� �Ϸ� �Ǿ����ϴ�. ---");
					count++;
					
					//System.out.println("coin---->" + coin);
					System.out.println("change---->" + change);
					
					//�ܵ��� �ּ��ֹ� �ݾ�(200) ���� ũ�� --> �߰� �ֹ� ����, ������ --> �ֹ����� ���
					if(count < orderMenu.length) {
						if(change>=pricelist[pricelist.length-1]) {						
							System.out.print("�߰��ֹ� �Ͻðڽ��ϱ�(y/n)>");
							String order = scan.next();
							if(order.equals("y")) {
								//�߰��ֹ�---> �޴� ���� �ݺ�
								coin = change;
							}else {
								//�߰��ֹ� ����
								menu_flag = false;
							}
						}else {
							//�ܵ� ����
							menu_flag = false;
						}
					}else {
						System.out.println("�ִ� �ֹ� ������ "+orderMenu.length+"������ �Դϴ�.");
						menu_flag = false;
					}
					
				}//while(menu_flag)
				
				for(String omenu : orderMenu) {
					if(omenu != null)
						System.out.println("�ֹ��޴�--->" + omenu);
				}
				System.out.println("�ܵ�--->" + change);	
				//menu_flag = false;
				flag = false;				
			
			}else {
				//�ݾ� ����
				System.out.println("�ݾ��� �����մϴ�. ������ �Է����ּ���.");
			}
		}//while
	
		System.out.println(" +++++++++   ���α׷� ����       ++++++++++");
		
	}//main

}//class