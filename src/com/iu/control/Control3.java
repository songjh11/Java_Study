package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;//지역변수
		Scanner sc = new Scanner (System.in);
		System.out.println("1~3까지의 숫자 입력");
		int select = sc.nextInt();
		
		if (select == 1) {
			int count = 1;//지역변수
			System.out.println("num");
			System.out.println("1 선택");
		} else if (select == 2) {
			int count = 1;//지역변수
			System.out.println("2 선택");
		} else if(select == 3) {
			System.out.println("3 선택");
		} //else를 빼도 문법적으로 틀린건 아니지만 버그를 줄일수 있기 때문에 else를 써주는게 좋다
		else {
			int count = 1;//지역변수
			System.out.println("오류");
		}
		System.out.println(num);
		//System.out.println(count); 얘는 조건문과 함께 끝나버려서 에러남 
	}

}
