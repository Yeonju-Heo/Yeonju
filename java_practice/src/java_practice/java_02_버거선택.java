package java_practice;

import java.util.Scanner;

public class java_02_���ż��� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("�ڡڡڡڡڡڡ� ���Ը��� �޴��� �ڡڡڡڡڡڡ�");
		System.out.println("1)�Ի����  2)�������  3)�ݶ�  4)����");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println();		

		
		boolean flag = true;
		
		while(flag) {
			
			System.out.print("���ϴ� �޴��� �Է��ϼ���(��ȣ)> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("�Ի���� 5õ���Դϴ�.");
				boolean insert = true;
				while(insert) { 
				System.out.print("���Աݾ� �Է�: ");
				int price = scan.nextInt();
				if(price>=5000) {
				System.out.println("�Ի���� �ֹ� �Ϸ�!");
				insert = false;
				}else {
					System.out.println("�ݾ��� �����մϴ�. �ٽ� �־��ּ���.");
				}}
				break;
			case 2:
				System.out.println("������� �ֹ� �Ϸ�!");
				break;
			case 3:
				System.out.println("�ݶ� �ֹ� �Ϸ�!");
				break;
			case 4:
				System.out.print("�����Ͻðڽ��ϱ�?(y/n)> ");
				String choice = scan.next();
				if(choice.equals("y")) flag = false;
				break; 
			default:
				System.out.println("�޴� �غ����Դϴ�.");
			}
		
		
		}
		
		System.out.println("�ȳ��� ������!");

		
	}

}
