package java_practice;

import java.util.Scanner;

public class Java_05_�����ֹ� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String id = "gjduswn";
		String pass = "4314";
		boolean login_flag = true;

		System.out.println("#### Yeonzoo Book Store ####");

		while(login_flag) {
		System.out.print("ID > ");
		String login_id = scan.next();
		System.out.print("PASSWORD > ");
		String login_pass = scan.next();

		
			if (login_id.equals(id) && login_pass.equals(pass)) {
				System.out.println("# " + id+"�� ȯ���մϴ�! \n");
				login_flag = false;
			} else if((login_id.equals(id)==true) && (login_pass.equals(pass)==false)) {
				System.out.println("�� �ùٸ��� ���� ��й�ȣ�Դϴ�.");
			} else {
				System.out.println("�� �������� �ʴ� ���̵��Դϴ�.");
			}
		}

		System.out.println("���������������������������� ���� �ֹ� ���� ��������������������������");
		System.out.println("  1.���  2.��ȸ  3.�˻�  4.����  5.����  6.����  ");
		System.out.println("����������������������������������������������������������������������������");
		String[][] booklist = new String[5][6];
		String[] index = { "����", "����", "���ǻ�", "����", "�Ǽ�" };
		int count = 0, tot = 0;
		boolean flag = true;

		while (flag) {
			System.out.print("# �޴�(��ȣ) > ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("** �ֹ� ��� **");
				if (count < booklist.length) {
					for (int i = count; i < booklist.length; i++) {
						for (int j = 0; j < index.length; j++) {
							System.out.print(index[j] + " > ");
							booklist[i][j] = scan.next();
						}
						tot = Integer.parseInt(booklist[i][3]) * Integer.parseInt(booklist[i][4]);
						booklist[i][5] = String.valueOf(tot);
						count++;

						System.out.println("# ����� �Ϸ�Ǿ����ϴ�.");
						System.out.print("# �߰��� ����Ͻðڽ��ϱ�?(y/n) > ");
						String add = scan.next();
						if (add.equals("n")) {
							System.out.println("# ����� �����մϴ�.");
							i = booklist.length;
						} else {
							if (count == booklist.length) {
								System.out.println("# ��������� �����մϴ�.");
							}
						}
					}
				} else {
					System.out.println("# ��������� �����մϴ�.");
				}

				break;

			case 2:
				if (booklist[0][0] != null) {
					System.out.println("** �ֹ� ��ȸ **");
					System.out.print("����\t����\t���ǻ�\t����\t�Ǽ�\t�Ѿ�\n");
					System.out.println("����������������������������������������������������������������������������������");
					for (int i = 0; i < booklist.length; i++) {
						for (int j = 0; j < booklist[i].length; j++) {
							if (booklist[i][j] != null) {
								System.out.print(booklist[i][j] + "\t");
							}
						}
						System.out.println();
					}
				} else {
					System.out.println("# �ֹ� ������ �����ϴ�.");
				}

				break;

			case 3:
				if (booklist[0][0] != null) {
					System.out.println("** �ֹ� �˻� **");
					System.out.print("# ���� > ");
					String title = scan.next();
					int stitle = -1;

					for (int i = 0; i < booklist.length; i++) {
						if (title.equals(booklist[i][0])) {
							stitle = i;
							i = booklist.length;
						}
					} // ã�� å�� �ִ��� Ȯ��

					if (stitle != -1) { // ã�� å ����
						System.out.print("����\t����\t���ǻ�\t����\t�Ǽ�\t�Ѿ�\n");
						System.out.println("����������������������������������������������������������������������������������");
						for (String data : booklist[stitle]) {
							System.out.print(data + "\t");
						}
						System.out.println();

					} else { // ã�� å ����
						System.out.println("# ã�� ������ �ֹ������� �����ϴ�.");
					}

				} else {
					System.out.println("# �ֹ������� �����ϴ�.");
				}
				break;

			case 4:
				if (booklist[0][0] != null) {
					System.out.println("** �ֹ� ���� **");
					System.out.print("# ���� > ");
					String title = scan.next();
					int stitle = -1;

					for (int i = 0; i < booklist.length; i++) {
						if (title.equals(booklist[i][0])) {
							stitle = i;
							i = booklist.length;
						}
					} // ã�� å�� �ִ��� Ȯ��

					if (stitle != -1) { // ã�� å ����
						for (int j = 0; j < index.length; j++) {
							System.out.print(index[j] + " > ");
							booklist[stitle][j] = scan.next();
						}
						tot = Integer.parseInt(booklist[stitle][3]) * Integer.parseInt(booklist[stitle][4]);
						booklist[stitle][5] = String.valueOf(tot);

					} else { // ã�� å ����
						System.out.println("# ã�� ������ �ֹ������� �����ϴ�.");
					}

				} else {
					System.out.println("# �ֹ������� �����ϴ�.");
				}

				break;

			case 5: // ����
				if (booklist[0][0] != null) {
					System.out.println("** �ֹ� ���� **");
					System.out.print("# ���� > ");
					String title = scan.next();
					int stitle = -1;

					for (int i = 0; i < booklist.length; i++) {
						if (title.equals(booklist[i][0])) {
							stitle = i;
							i = booklist.length;
						}
					} // ã�� å�� �ִ��� Ȯ��

					if (stitle != -1) {
						for (int j = stitle; j < booklist.length - 1; j++) {
							booklist[j] = booklist[j+1];
						}
						count--;
						booklist[booklist.length - 1] = new String[6];
						System.out.println("# ������ �Ϸ�Ǿ����ϴ�.");
					} else {
						System.out.println("# ã�� ������ �ֹ������� �����ϴ�.");
					}
				} else {
					System.out.println("# �ֹ������� �����ϴ�.");
				}
				break;
			case 6:
				System.out.print("# �����Ͻðڽ��ϱ�?(y/n) > ");
				String quit = scan.next();

				if (quit.equals("y")) {
					System.out.println("# ���α׷��� �����մϴ�.");
					flag = false;
				}
				break;

			default:
				System.out.println("# �޴� �غ� ��");
			}
		} // while

	}// main

}// class
