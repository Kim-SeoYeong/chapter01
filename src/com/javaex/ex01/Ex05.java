package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반적인 경우
		double pi = 3.14;
		double ban = 5;
		
		double result1 = ban * ban * pi;
		System.out.println(pi);
		System.out.println(result1);
		
		//pi값을 변경하는 경우
		//pi = 3.141592;	//상수로 정의되면 오류발생
		double result2 = ban * ban * pi;
		System.out.println(result2);
		
		//상수정의	//final을 사용시 보통 변수선언은 대문자로 해줌.
		final double PI = 3.14;
		double result3 = PI * ban * ban;
		System.out.println(result3);
	}

}
