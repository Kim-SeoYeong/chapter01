package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6의 배수이자 14의 배수인 가장 작은 정수 찾기
		//((num)%6==0) && ((num)%14))
		//예제1
		/*
		int i = 1;
		
		while(true) {
			if ((i%6==0)&&(i%14==0)) {
				System.out.println(i);
				break;
			}
			i++;
		}
		*/
		
		for(int j=1; j<=50; j++) {
			if ((j%6==0)&&(j%14==0)) {
				System.out.println(j);
			}
		}
		
	}
}

