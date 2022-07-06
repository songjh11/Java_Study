package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홀수, 짝수
		Scanner sc = new Scanner (System.in);
		
		int a = 0;
		String result = "홀수입니다";
		
		System.out.println("정수를 입력하세요");
		a = sc.nextInt();
				
		if(a%2==0) {
			result="짝수입니다";
		}
		
		System.out.println(result);
	}

}
