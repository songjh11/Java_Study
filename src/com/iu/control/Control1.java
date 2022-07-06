package com.iu.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문
		//1. 단일if문
		System.out.println("Start");
		Scanner sc = new Scanner (System.in); 
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + "은(는) 짝수입니다");
				}
		if(num<10) {
			System.out.println(num+"은(는) 10 미만임");//false는 실행이 안됨
		}
			System.out.println("Finish");
	}

}
