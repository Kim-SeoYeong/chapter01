package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또번호 자동생성기 for문 사용
		
		int[] intArray = new int[8];
		
		System.out.println(intArray.length);
		
		for(int i=0; i<8; i++) {
			intArray[i] = (int)(Math.random()*45)+1;
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println("");
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*45)+1;
			System.out.print(intArray[i] + " ");
		}
		

	}

}
