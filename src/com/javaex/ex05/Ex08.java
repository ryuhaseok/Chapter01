package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {

		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {20, 20, 40};
		
		//코드작성
		//방개수 비교
		//방개수 다르면
		if (leftArray.length != rightArray.length) {
			System.out.println("두배열의 크기가 다릅니다.");
		//방개수 같으면	
		} else {
			//값 비교
			for(int i=0; i<leftArray.length; i++) {
				//같은 방의 값이 다르면
				if (leftArray[i] != rightArray[i]) {
					System.out.println(i+" 번째 값이 다릅니다.");
					
				}
			
			}//for
			
		}//if~else
		
	}

}
