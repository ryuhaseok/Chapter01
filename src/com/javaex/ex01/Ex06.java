package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		double pi = 3.14;
		double result = pi*5*5;
		System.out.println(pi);
		System.out.println(result);
		
		//
		pi = 3.141519;
		double circleArea = pi*5*5;
		System.out.println(circleArea);
		
		////////////////////////////////
		
		//상수로 정의할때 *대문자로 표기
		final double PI = 3.14;
		double result02 = PI*5*5;
		System.out.println(result02);
		
		//PI = 3.141519; // 상수값을 변경하려고 할 때 오류 확인
		double circleArea2 = PI*5*5;
		System.out.println(circleArea2);
		
	}
}
