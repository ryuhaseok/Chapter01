package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//반복
		while (true) {
			
			System.out.println("숫자를 입력하세요");
			int i = sc.nextInt();
			
			//탈출조건 문법 if () {break;}
			//탈출조건을 제일 아래 쓰면 0을 입력했을때도 3의 배수입니다가 출력되고 종료됨.
			/*break대신 continue를 사용하면 조건이 맞을 때만 continue 아래를 수행하지 않고
			  계속 반복문 수행
			   */
			if (i==0) {
				 System.out.println("종료");
				 break;
			}
			
			if (i%3==0) {
				 System.out.println("3의 배수입니다.");
				 
			 } else {
				 System.out.println("3의 배수가 아닙니다.");
				 
			 } 
			
		}
		
		sc.close();
		
	}
}
