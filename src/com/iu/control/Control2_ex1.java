package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//월급 입력
		//1을 입력하면 정규직, 2를 입력하면 계약직
		//정규직이면 국민연금(월급의 1%), 건강보험(월급의 1.4%), 고용보험(월급의 0.5%), 산재보험(월급의 0.7%)을 떼고 
		//계약직이면 월급의 3.3% 떼고 지급
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		int num = 0;
		double pay = 0;
		
		System.out.println("급여를 입력하세요");
		money = sc.nextInt();
		
		System.out.println("직원번호를 입력하세요");
		num = sc.nextInt();
		
		
		if(num==1) {
			System.out.println("정규직입니다");
		} else {System.out.println("계약직입니다");}
		
		if(num==1) {
			pay= money-(money*0.01 + money*0.014 + money*0.005 + money*0.007);
			/*
			 * int tax1 = (int)(sal*0.01);
			 * int tax2 = (int)(sal*0.014);
			 * int tax3 = (int)(sal*0.005);
			 * int tax4 = (int)(sal*0.007);
			 * sal=sal-tax1-tax2-tax3-tax4;
			 */
			} else {pay = money-(money*0.033); 
		}
		System.out.println("이번달 급여는 "+(int)pay+"원입니다");
	}

}