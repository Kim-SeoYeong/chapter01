package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동형변환1
		int num01 = 1;
		float num02 = 1.0f;
		float result01 = num01 + num02;
		System.out.println(result01);
		
		//자동형변환2
		long num03 = 12345;
		float num04 = 1.1F;
		
		float result02 = num03 + num04;
		System.out.println(result02);
		
		////////////////////////////////////////////////////////////
		
		//강제형변환
		int i = (int)1112.42323;
		System.out.println(i);

		float var01 = 12.5f;
		int var02 = (int)var01;
		
		//강제형변환 : 확대변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v02);
		
		//강제형변환 : 축소변환(정상)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//강제형변환 : 축소변환(비정상)
		int v05 = 1230443;
		byte v06 = (byte)v05;
		System.out.println(v06);
		System.out.println(v05);
		
		//강제형변환 : 실수-->정수로 변환(소수점 이하 없어짐)
		double v07 = 53.578;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//강제형변환 : 정수 --> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		

		
		
		
	}

}
