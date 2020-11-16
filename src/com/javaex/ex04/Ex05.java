package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i;
		
		for(i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println(i + " 까지의 합은 " + sum);
		}
		System.out.println("1부터 " + (i-1) + " 까지의 합은 " + sum + " 입니다.");
		sc.close();
	}	

}
