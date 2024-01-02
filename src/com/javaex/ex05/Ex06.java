package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {

		// A배열
				int[] arrA = new int[3];
				arrA[0] = 3;
				arrA[1] = 6;
				arrA[2] = 9;
				
				// A배열 출력
				for(int i =0; i<arrA.length; i++) {
					System.out.println(arrA[i]);
				}
				System.out.println("---------------------------");

				// B배열 변수 선언
				int[] arrB;
				
				// A배열의 주소(참조값)을 변수 arrB에 대입
				arrB = arrA;
				
				// 배열B 출력
				for (int i=0; i<arrB.length; i++) {
					System.out.println(arrB[i]);
				}
				
				System.out.println("---------------------------");
				//arrA[0] 의 값을 99로 변경
				// arrA arrB 전체 출력
				System.out.println("---------------------------");
				//두배열의 값이 같으면 주소가 같다
				
				arrA[0] = 99;
				
				for(int i=0; i<arrA.length; i++) {
					System.out.println(arrA[i]);
					
				}
				System.out.println("---------------------------");
				
				for(int i=0; i<arrB.length; i++) {
					System.out.println(arrB[i]);
					
				}
		
	}

}
