package java_practice;

import java.util.Scanner;

public class java_01_������ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�� �ܺ��� ����ұ��?> ");
		int start = scan.nextInt();
		
		System.out.print("�� �ܱ��� ����ұ��?> ");
		int end = scan.nextInt();
		
		System.out.println();
		
		System.out.println("�ڡڡڡڡ� ������ �ڡڡڡڡ�");
		for(int i=1;i<10;i++) {
			for(int j=start;j<end+1;j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
		
		

	}

}
