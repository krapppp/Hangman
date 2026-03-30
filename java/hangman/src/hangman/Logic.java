package hangman;

import java.util.Scanner;

public class Logic {
	public static void main(String[] args) {
//		main + ctrl + space : 메인 메소드 호출
//		스캐너 + next or nextInt 내부 함수 사용 필수
		
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("입력 : "+n1);
		Scanner sc1= new Scanner(System.in);
		String s1=sc.next();
		System.out.println("입력 : "+s1);
	}

}
