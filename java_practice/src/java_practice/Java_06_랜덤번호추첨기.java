package java_practice;

import java.util.Scanner;

public class Java_06_������ȣ��÷�� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("*** ���� ��ȣ ��÷�� ***");
		System.out.println("��÷�� �����Ͻðڽ��ϱ�?");
		System.out.print("1.��   2.�ƴϿ�  > ");
		int choice = scan.nextInt();

		if (choice == 1) {

			int[] ballArr = new int[45];
			int[] ball6 = new int[6];

			for (int i = 0; i < ballArr.length; i++) {
				ballArr[i] = i + 1;
			}

			for (int i = 0; i < ballArr.length; i++) {
				int j = (int) (Math.random() * ballArr.length);
				int tmp = 0;

				tmp = ballArr[i];
				ballArr[i] = ballArr[j];
				ballArr[j] = tmp;

			}
			System.arraycopy(ballArr, 0, ball6, 0, 6);

			for (int i = 0; i < ball6.length; i++) {
				System.out.println(ball6[i]);
			}
			System.out.println("��÷�� �Ϸ� �Ǿ����ϴ�.");
			System.out.println("��÷�� ����մϴ�.");
			
		} else {
			System.out.println("��÷�⸦ �����մϴ�.");
		}
		
		
		
	}//m

}//c
