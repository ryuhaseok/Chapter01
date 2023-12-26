package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//스캐너준비
		Scanner sc = new Scanner(System.in);
		/*
		//안내문구
		System.out.println("이름을 입력해 주세요");
		
		//이름:
		System.out.print("이름: ");
		
		//이름입력받기
		String name = sc.nextLine();
		
		//안내문구
		System.out.println("나이를 입력해 주세요");
		
		//나이:
		System.out.print("나이: ");
		
		//나이입력받기
		int age = sc.nextInt();
		
		//출력
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		
		//스캐너종료
		*/
		/*숫자를 받고 문자를 받는 경우는 버그 생김
		따라서 숫자를 받고 sc.nextLine();을 중간에 넣어주면 해결
		*/
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name2 = sc.nextLine();
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age2 = sc.nextInt();
		System.out.println("키를 입력해주세요");
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.println("당신의 이름은 " + name2 + " 나이는 " + age2 + "키는 " + height + "입니다.");
		
		
		
		sc.close();
	}
}
