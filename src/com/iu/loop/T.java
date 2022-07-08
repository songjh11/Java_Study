package com.iu.loop;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<11; i++) {
		sum=sum+i;
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner (System.in);
		
		int yId=1234;//회원가입시 입력한 ID
		int yPw=5678;//회원가입시 입력한 PW
//		int id = 0;
//		int pw = 0;
//		
//		System.out.println("아이디를 입력하세요");
//		id=sc.nextInt();
//		System.out.println("패스워드를 입력하세요");
//		pw=sc.nextInt();
//		
//		if(yId==id&&yPw==pw) {
//			System.out.println("로그인성공");
//			} else {	
//		for(int i=0; i<=5; i++) {
//			System.out.println("아이디를 입력하세요");
//			int id=sc.nextInt();
//			System.out.println("패스워드를 입력하세요");
//			int pw=sc.nextInt();
//			if(yId==id&&yPw==pw) {
//				System.out.println("로그인성공");
//				break;
//				}else if (yId != id) {
//					System.out.println("로그인실패");
//			}else if (yPw != pw) {
//				System.out.println("로그인 실패");
//		}
//			
//		}
//		System.out.println("End");	
		
	}

}
