package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// 0분 0초부터 59분 59초까지
		//스캐너로 분과 초를 입력받고 ex)1분 15초 입력
		//해당 시간에 종료

		Scanner sc = new Scanner (System.in);
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int sec = sc.nextInt();
		
//		boolean flag = false;
		
		for(int m=0; m<60; m++) {
			for (int s=0; s<60; s++) {
				System.out.println(m+"분"+s+"초");
			    if(min==m&&sec==s) {
//			    	flag = !flag;
			    	m=60;
				break;
			}
			}
//			if(flag) {	
//			break;}
			
		}
		}
		
	}


