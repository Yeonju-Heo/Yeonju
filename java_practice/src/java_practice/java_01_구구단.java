package java_practice;

import java.util.Scanner;

public class java_01_구구단 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단부터 출력할까요?> ");
		int start = scan.nextInt();
		
		System.out.print("몇 단까지 출력할까요?> ");
		int end = scan.nextInt();
		
		System.out.println();
		
		System.out.println("★★★★★ 구구단 ★★★★★");
		for(int i=1;i<10;i++) {
			for(int j=start;j<end+1;j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
		
		

	}

}
