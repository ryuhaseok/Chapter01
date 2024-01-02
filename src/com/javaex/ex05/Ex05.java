package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {

		//배열 선언
		int intArray[] = new int[6];
		
		//배열 자료도 반복문으로 지정 가능
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+"\t");
		}
		
	}

}
