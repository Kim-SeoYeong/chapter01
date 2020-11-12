package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		
		if (time <= 8) {
			price = time * 10000;
			System.out.println("임금은 " + price + "원 입니다.");
		} else {
			price = (8 * 10000) + ((time-8) * (int)(10000 * 1.5));
			System.out.println("임금은 " + price + "원 입니다.");
		}
		sc.close();

	}

}
