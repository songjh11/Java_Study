package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// 0분 0초부터 59분 59초까지
		//스캐너로 분과 초를 입력받고 ex)1분 15초 입력
		//해당 시간에 종료

		Scanner sc = new Scanner (System.in);
				
		for(int m=0; m<60; m++) {
			int a = sc.nextInt();
			for (a=0; )
			System.out.print("현재 시간은"+m+"분");
			
			for (int s=0; s<60; s++) {
				System.out.print("현재 시간은"+m+"분"+":"+s+"초");
				} 
				
			}
		
		}
		
	}


