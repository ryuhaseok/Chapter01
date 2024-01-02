package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		int sum=0;
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 (0이면종료)");
	
		
		// do while 문은 조건이 안 맞아도 1번은 무조건 실행
		do {
			no = sc.nextInt();
			sum = sum+ no;
			System.out.println(sum);
		
		} while(no!=0);
		
		// while if break는 조건이 
		/*
		while(true) {
			int no= sc.nextInt();
			if (no == 0) {
				//더하기
				sum = sum+ no;
				System.out.println(sum);
				
			} else {
				System.out.println("종료");
				break;
			}
		}
		*/	
			
		
		sc.close();
	
	
	}

}
