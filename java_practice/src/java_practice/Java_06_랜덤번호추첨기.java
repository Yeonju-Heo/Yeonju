package java_practice;

import java.util.Scanner;

public class Java_06_랜덤번호추첨기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("*** 랜덤 번호 추첨기 ***");
		System.out.println("추첨을 진행하시겠습니까?");
		System.out.print("1.예   2.아니오  > ");
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
			System.out.println("추첨이 완료 되었습니다.");
			System.out.println("당첨을 기원합니다.");
			
		} else {
			System.out.println("추첨기를 종료합니다.");
		}
		
		
		
	}//m

}//c
