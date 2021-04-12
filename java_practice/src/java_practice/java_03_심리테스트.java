package java_practice;

import java.util.Scanner;

public class java_03_심리테스트 {

	public static void main(String[] args) throws Exception {

		System.out.println("*********** 테스트 ***********");
		Thread.sleep(500);
		System.out.println("본 테스트는 if문 연습을 위해 만들어진 테스트입니다.");
		Thread.sleep(500);
		System.out.println("초보자 화이팅 !!!!!!!!!!!!!!!!!");
		Thread.sleep(500);
		System.out.println("**********************************");
		Thread.sleep(500);

		String name = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("시작 전 이름을 입력하세요>");
		name = scan.next();

		System.out.println("안녕하세요. " + name + "님. 테스트를 시작합니다.");
		Thread.sleep(1000);
		System.out.print("# 당신이 좋아하는 음료는? 1)콜라 2)사이다  > ");
		int gender = scan.nextInt();
		if (gender == 1) {
			System.out.println("당신은 북극곰입니다.");
		} else {
			System.out.println("좋습니다. 더 진행해볼게요!");
			Thread.sleep(1000);
			System.out.print("# 당신이 더 선호하는 음식은? 1)민트초코라떼 2)파인애플피자 > ");
			int food = scan.nextInt();
			if (food == 1) {
				System.out.println("저는 민트반대파입니다. 나가주세요!");
			} else {
				System.out.println("파인애플 피자는 그래도 먹을만 해요!");
				Thread.sleep(1000);
				System.out.println("마지막 문제입니다.");
				Thread.sleep(1000);
				System.out.print("# 당신이 좋아하는 계절은? 1)봄 2)겨울 > ");
				int weather = scan.nextInt();
				if (weather == 1) {
					System.out.println("당신은 벚꽃입니다.");
				} else {
					System.out.println("당신은 붕어빵입니다.");
				}
			}
		}
		System.out.println("***** 테스트 종료 *****");
	}

}
