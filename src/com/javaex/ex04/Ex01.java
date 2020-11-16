package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//초기화 조건식 증감식
		Scanner sc = new Scanner(System.in);
		
		int i = 3;
		while(i<5) {
			System.out.println("I like java - " + i);
			i++;
		}
		
		sc.close();
	}

}
