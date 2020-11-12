package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.print("근무시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		if ((0< time)&&(time <= 8)) {
			price = time * 10000;
			System.out.println("임금은 " + price + "원 입니다.");
		} else if (time > 8){
			price = (8 * 10000) + ((time-8) * 12000);
			System.out.println("임금은 " + price + "원 입니다.");
		} else {
			System.out.println("잘못된 시간입력입니다.");
		}
			
		sc.close();

	}

}
