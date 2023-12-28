package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {

		//20까지라는 반복횟수 정해져있기때문에 for문 사용
		//2의배수 or 3의배수에서 종료가 아닌 20까지 이기때문에 continue 사용
		//continue문 조건인 2의배수 or 3의배수에 해당하는지 확인
		//해당하지 않으면 출력
		//해당하면 출력하지 않고 반복
		
		//for문에서 선언한 변수 i는 해당 for문 안에서만 사용하기때문에
		//다시 i로 변수 선언 가능함

		for (int i = 1; i<21; i++) {
			if (i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		
		for (int i = 1; i<21; i++) {
			
			if (i%2==0 || i%3==0) {
				
			}else {
				System.out.println(i);
			}
		}
		System.out.println("----------------------------------");
		
		for (int i = 1; i<21; i++) {
			
			if ( !(i%2==0 || i%3==0) ) {
				System.out.println(i);
			}
		}
		
	}

}
