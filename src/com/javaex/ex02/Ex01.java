package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
	
		int i = 12345;
		double d = 3.14;
		char c = '한';
		String str = "안녕하세요";
		String name = "황일영";
		String hello = "굿모닝";

		System.out.println(i);
		System.out.println(12345);
		
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		
		System.out.print(name);
		System.out.println(str);
		
		System.out.println("------------------------------");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("------------------------------");

		System.out.println(name + "님 " + hello + hello);
		System.out.println("제이름은 " + name + " 입니다.");
		System.out.println("------------------------------");
		System.out.println(i+i);
		System.out.println(d+d);
		
		System.out.println(i+d);
		
		System.out.println(c+c); // char은 +를 만나면 숫자로 바뀜
		
		System.out.println(name + i + d); // 문자열과 숫자변수를 + 하면 문자열로 바뀜
		
		System.out.println("------------------------------");

		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		
		
	}	
}
