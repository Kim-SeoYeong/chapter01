package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = new int[3];
		 
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB;
		
		arrB = arrA;
		
		System.out.println("arrA[]");
		for(int i=0; i<arrA.length; i++) {
			System.out.println("i=" + arrA[i]);
		}
		
		System.out.println("arrB[]");
		for(int i=0; i<arrB.length; i++) {
			System.out.println("i=" + arrB[i]);
		}
		
	}

}
