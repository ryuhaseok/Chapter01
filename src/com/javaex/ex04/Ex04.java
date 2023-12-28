package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		
		int n = sc.nextInt();
			
			//초기값 조건식 증감식
		for (int i=1;i<10;i++)
		{
			
			System.out.println(n + " * " + i + " = " + n*i);
			
		}
		
		sc.close();
		
	}

}
