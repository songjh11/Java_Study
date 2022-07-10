package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알
		//탄창: 30발, 3개
		//1.단발:탕 2.점사(3발씩):타타탕
		//탄창 갈아낄때마다 종류 선택
		
		Scanner sc = new Scanner (System.in);
		
		
//		for(int i=0; i<3; i++) {
//			System.out.println("종류 선택");
//			int select = sc.nextInt();
//			switch(select) {
//			case 1:
//			for(int d=0; d<30; d++) {
//				System.out.println("탕");
//			}
//			break;
//			case 2:
//				for(int d=0; d<10; d++) {
//					System.out.println("타타탕");
//				}
//				break;
//		}
//		} System.out.println("끝");
		
//		for(int i=1; i<4; i++) {
//			System.out.println("종류 선택");
//			int select = sc.nextInt();
//			if(select==1) {
//				for(int d=1; d<31; d++) {
//				System.out.println(i+"번 탄창 "+d+"번 총알"+"\n탕");
//			} }	else if(select==2) {
//				for(int d=1; d<11; d++) {
//					System.out.println(i+"번 탄창 "+d+"번 총알"+"\n타타탕");
//				}
//					}
//			else {
//				System.out.println("에러");
//			}
//		} System.out.println("끝");
		
//		for(int i=1; i<4; i++){
		//	int count=10;
//		String sound = "타타탕"; 
//		System.out.println("종류 선택");
//		int select = sc.nextInt();
		//if (select==1) {
//			count=30;
//			sound="탕";
//		}
//		for (int b=0; b<count; b++) {
//			System.out.println(sound);
//		}
		for(int i=1; i<4; i++) {
			System.out.println("종류 선택");
			int select = sc.nextInt();
			int inc=3;
			String sound="타타탕";
			if(select==1) {
				inc=1;
				sound="탕";
			}
			for(int b=0; b<30;b=b+inc) {
				System.out.println(sound);
			}
				
			}
	}
	}

