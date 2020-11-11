package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리연산자
		int a = 5;
		int b = 7;
		
		//&&
		System.out.println("&&연산자");
		System.out.println(true && true); 		//T&&T True;
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		//||
		System.out.println("||연산자");
		System.out.println(true || true); 		//T&&T True;
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//응용
		System.out.println("응용");
		System.out.println((a<b)&&(a<b));	//5>7(false) && 5<7(true) ==> false
		System.out.println((a>b)&&(a>b)); 	//5>7(false) && 5>7(false) ==> false
		System.out.println((a>b)||(a<b));	//5>7(false) || 5<7(true) ==> true
		
		System.out.println("! 연산자");
		System.out.println((a>b));	//5>7 --> false
		System.out.println(!(a>b)); 	//!f --> true
		
		System.out.println(!(a<b)); 	//!T --> false
		
		
	}	

}
