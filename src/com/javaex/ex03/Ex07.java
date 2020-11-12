package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if ((score <= 100) && (score >= 90)) {
			System.out.println("A등급 입니다.");
		} else if ((score < 90) && (score >= 80)) {
			System.out.println("B등급 입니다.");
		} else if ((score < 80) && (score >= 70)) {
			System.out.println("C등급 입니다.");
		} else if ((score < 70) && (score >= 60)) {
			System.out.println("D등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
		
		sc.close();
	}

}
