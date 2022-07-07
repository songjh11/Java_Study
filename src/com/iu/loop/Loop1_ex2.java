package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// 1. 1번이면 대문자, 2번이면 소문자
		//    1번이면 A-Z까지 출력
		//    2번이면 a-z까지 출력
		
		//2. 1-10까지 합 구하기
		
		//3. ID, PW 입력해서 로그인 판단
		//   최대 5번까지 로그인 시도 가능
		//   중간에 로그인 성공하면 종료
		int yId=1234;//회원가입시 입력한 ID
		int yPw=5678;//회원가입시 입력한 PW
		
		Scanner sc = new Scanner (System.in);
		int a = 0;
		System.out.println("1.대문자 2.소문자");
		a=sc.nextInt();
				
		switch(a) {
		case 1:
		for(int i='A'; i<='Z'; i++) {
			System.out.println((char)i);
		} break;
		case 2:
		for(int i='a'; i<='z'; i++) {
			System.out.println((char)i);
		}
				}
		
		
		System.out.println("=====================================");
		int sum = 0;
		for(int i=0; i<=10; i++) {
		sum=sum+i;
		}
		System.out.println(sum);
		
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
		
		int i = 0;//지역변수를 꺼내서 활용
		boolean check=false;
		for(i=0; i<5; i++) {
			System.out.println("아이디를 입력하세요");
			int id=sc.nextInt();
			System.out.println("패스워드를 입력하세요");
			int pw=sc.nextInt();
			if(yId==id&&yPw==pw) {
				System.out.println("로그인성공");
				i=i+5;
				check=!check;
				//break;
				
				}else if (yId != id) {
					System.out.println("로그인실패");
			}else if (yPw != pw) {
				System.out.println("로그인 실패");
		}
			
		}// for 끝
		// 1. 로그인 성공
		//2. 로그인 5번 전부 실패
		System.out.println("End");	
		if(i>5) {
			System.out.println("업무 시작");
		} else {
			System.out.println("은행 방문이 필요합니다");
		}
		if(check) {
		System.out.println("게임 시작");
		} else { System.out.println("은행 방문이 필요합니다");
					}
	}
}
//초가 0분 0초부터 시작해서 32분이 되면 알람이 울린다<-문제풀이
//전자렌지에 도시락 돌릴때 얼마나 돌리면 끝나는지


