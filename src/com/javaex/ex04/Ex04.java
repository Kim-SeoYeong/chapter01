package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;

		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
		sc.close();
	}

}
