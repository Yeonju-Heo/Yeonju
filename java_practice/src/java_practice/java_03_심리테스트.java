package java_practice;

import java.util.Scanner;

public class java_03_�ɸ��׽�Ʈ {

	public static void main(String[] args) throws Exception {

		System.out.println("*********** �׽�Ʈ ***********");
		Thread.sleep(500);
		System.out.println("�� �׽�Ʈ�� if�� ������ ���� ������� �׽�Ʈ�Դϴ�.");
		Thread.sleep(500);
		System.out.println("�ʺ��� ȭ���� !!!!!!!!!!!!!!!!!");
		Thread.sleep(500);
		System.out.println("**********************************");
		Thread.sleep(500);

		String name = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("���� �� �̸��� �Է��ϼ���>");
		name = scan.next();

		System.out.println("�ȳ��ϼ���. " + name + "��. �׽�Ʈ�� �����մϴ�.");
		Thread.sleep(1000);
		System.out.print("# ����� �����ϴ� �����? 1)�ݶ� 2)���̴�  > ");
		int gender = scan.nextInt();
		if (gender == 1) {
			System.out.println("����� �ϱذ��Դϴ�.");
		} else {
			System.out.println("�����ϴ�. �� �����غ��Կ�!");
			Thread.sleep(1000);
			System.out.print("# ����� �� ��ȣ�ϴ� ������? 1)��Ʈ���ڶ� 2)���ξ������� > ");
			int food = scan.nextInt();
			if (food == 1) {
				System.out.println("���� ��Ʈ�ݴ����Դϴ�. �����ּ���!");
			} else {
				System.out.println("���ξ��� ���ڴ� �׷��� ������ �ؿ�!");
				Thread.sleep(1000);
				System.out.println("������ �����Դϴ�.");
				Thread.sleep(1000);
				System.out.print("# ����� �����ϴ� ������? 1)�� 2)�ܿ� > ");
				int weather = scan.nextInt();
				if (weather == 1) {
					System.out.println("����� �����Դϴ�.");
				} else {
					System.out.println("����� �ؾ�Դϴ�.");
				}
			}
		}
		System.out.println("***** �׽�Ʈ ���� *****");
	}

}
