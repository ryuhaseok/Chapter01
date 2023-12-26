package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		// 자동 형변환
		int var00 = 3+5;
		System.out.println(var00);
		
		int a = 3; // 정수형과 실수형 계산 시 정수형 3이 3.0 실수형으로 형변환되어 계산 시도
		double b = 3.5;
		double var02 = a+b;
		System.out.println(var02);
		
		////////////////////////////
		//강제 형변환
		
		float var04 = 1111.6345F;
		int var05 = (int)var04;
		System.out.println(var04);
		System.out.println(var05);
		
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
	}
}
