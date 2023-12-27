package com.javaex.ex03;

import java.util.Scanner;

public class Ex08review {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int no = sc.nextInt();
		// 양수?
		if (no>0) {
			// 짝수?
			if (no%2==0) {
				System.out.println("짝수입니다.");
				
			} else {
				System.out.println("홀수입니다.");
				
			}
		} else if (no<0) {
			System.out.println("음수입니다.");
			
		} else {
			System.out.println("0입니다.");
			
		}
		
		sc.close();
		
	}

}
