package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {

		//반복 횟수가 정해져 있을 때 - for문
		//반복 횟수 X 조건을 충족하면 끝내야할 때 - while문 사용
		
		int i = 1;
		
		//반복 시작
		while (true) {
			//조건 확인
			if ( i%6 == 0 && i%14 == 0 ) {
				System.out.println(i);
				//맞으면 끝
				break;
			}
			//아니면 i++ 후 다시 while 반복
			i++;
		}
		
		
	}

}
