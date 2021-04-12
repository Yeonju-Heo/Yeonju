package java_practice;

import java.util.Scanner;

public class Java_05_도서주문 {

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
				System.out.println("# " + id+"님 환영합니다! \n");
				login_flag = false;
			} else if((login_id.equals(id)==true) && (login_pass.equals(pass)==false)) {
				System.out.println("※ 올바르지 않은 비밀번호입니다.");
			} else {
				System.out.println("※ 존재하지 않는 아이디입니다.");
			}
		}

		System.out.println("┌───────────── 도서 주문 관리 ────────────┐");
		System.out.println("  1.등록  2.조회  3.검색  4.수정  5.삭제  6.종료  ");
		System.out.println("└────────────────────────────────────┘");
		String[][] booklist = new String[5][6];
		String[] index = { "제목", "저자", "출판사", "정가", "권수" };
		int count = 0, tot = 0;
		boolean flag = true;

		while (flag) {
			System.out.print("# 메뉴(번호) > ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("** 주문 등록 **");
				if (count < booklist.length) {
					for (int i = count; i < booklist.length; i++) {
						for (int j = 0; j < index.length; j++) {
							System.out.print(index[j] + " > ");
							booklist[i][j] = scan.next();
						}
						tot = Integer.parseInt(booklist[i][3]) * Integer.parseInt(booklist[i][4]);
						booklist[i][5] = String.valueOf(tot);
						count++;

						System.out.println("# 등록이 완료되었습니다.");
						System.out.print("# 추가로 등록하시겠습니까?(y/n) > ");
						String add = scan.next();
						if (add.equals("n")) {
							System.out.println("# 등록을 종료합니다.");
							i = booklist.length;
						} else {
							if (count == booklist.length) {
								System.out.println("# 저장공간이 부족합니다.");
							}
						}
					}
				} else {
					System.out.println("# 저장공간이 부족합니다.");
				}

				break;

			case 2:
				if (booklist[0][0] != null) {
					System.out.println("** 주문 조회 **");
					System.out.print("제목\t저자\t출판사\t정가\t권수\t총액\n");
					System.out.println("─────────────────────────────────────────");
					for (int i = 0; i < booklist.length; i++) {
						for (int j = 0; j < booklist[i].length; j++) {
							if (booklist[i][j] != null) {
								System.out.print(booklist[i][j] + "\t");
							}
						}
						System.out.println();
					}
				} else {
					System.out.println("# 주문 내역이 없습니다.");
				}

				break;

			case 3:
				if (booklist[0][0] != null) {
					System.out.println("** 주문 검색 **");
					System.out.print("# 제목 > ");
					String title = scan.next();
					int stitle = -1;

					for (int i = 0; i < booklist.length; i++) {
						if (title.equals(booklist[i][0])) {
							stitle = i;
							i = booklist.length;
						}
					} // 찾는 책이 있는지 확인

					if (stitle != -1) { // 찾는 책 있음
						System.out.print("제목\t저자\t출판사\t정가\t권수\t총액\n");
						System.out.println("─────────────────────────────────────────");
						for (String data : booklist[stitle]) {
							System.out.print(data + "\t");
						}
						System.out.println();

					} else { // 찾는 책 없음
						System.out.println("# 찾는 도서의 주문내역이 없습니다.");
					}

				} else {
					System.out.println("# 주문내역이 없습니다.");
				}
				break;

			case 4:
				if (booklist[0][0] != null) {
					System.out.println("** 주문 수정 **");
					System.out.print("# 제목 > ");
					String title = scan.next();
					int stitle = -1;

					for (int i = 0; i < booklist.length; i++) {
						if (title.equals(booklist[i][0])) {
							stitle = i;
							i = booklist.length;
						}
					} // 찾는 책이 있는지 확인

					if (stitle != -1) { // 찾는 책 있음
						for (int j = 0; j < index.length; j++) {
							System.out.print(index[j] + " > ");
							booklist[stitle][j] = scan.next();
						}
						tot = Integer.parseInt(booklist[stitle][3]) * Integer.parseInt(booklist[stitle][4]);
						booklist[stitle][5] = String.valueOf(tot);

					} else { // 찾는 책 없음
						System.out.println("# 찾는 도서의 주문내역이 없습니다.");
					}

				} else {
					System.out.println("# 주문내역이 없습니다.");
				}

				break;

			case 5: // 삭제
				if (booklist[0][0] != null) {
					System.out.println("** 주문 삭제 **");
					System.out.print("# 제목 > ");
					String title = scan.next();
					int stitle = -1;

					for (int i = 0; i < booklist.length; i++) {
						if (title.equals(booklist[i][0])) {
							stitle = i;
							i = booklist.length;
						}
					} // 찾는 책이 있는지 확인

					if (stitle != -1) {
						for (int j = stitle; j < booklist.length - 1; j++) {
							booklist[j] = booklist[j+1];
						}
						count--;
						booklist[booklist.length - 1] = new String[6];
						System.out.println("# 삭제가 완료되었습니다.");
					} else {
						System.out.println("# 찾는 도서의 주문내역이 없습니다.");
					}
				} else {
					System.out.println("# 주문내역이 없습니다.");
				}
				break;
			case 6:
				System.out.print("# 종료하시겠습니까?(y/n) > ");
				String quit = scan.next();

				if (quit.equals("y")) {
					System.out.println("# 프로그램을 종료합니다.");
					flag = false;
				}
				break;

			default:
				System.out.println("# 메뉴 준비 중");
			}
		} // while

	}// main

}// class
