package com.iu.control;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num=0;
		System.out.println("숫자를 입력하세요");
		num=sc.nextInt();
				
		if(num%2==0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
	}

}
