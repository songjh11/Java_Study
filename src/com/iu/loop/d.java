package com.iu.loop;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);		
		int yId=1234;
		int yPw=5678;
		boolean check= true;//종료시 사용
		boolean start = false;//로그인 성공시 사용
		
		int gold = 1000;
		int exp = 0;
		int gold2 = 0;
		int lv = 1;
int level = 1;

while(check) {
	System.out.println("1.로그인 시도 2.종료");
	int num =sc.nextInt();
	if (num != 1 ) {
		check =! check;
		System.out.println("프로그램 종료");
		break;
				}
	System.out.println("아이디를 입력하세요");
	int i = sc.nextInt();
	System.out.println("비밀번호를 입력하세요");
	int p = sc.nextInt();
	if(yId==i&&yPw==p) {
	System.out.println("로그인 성공");
	check=!check;
	start=!start;
	System.out.println("게임 시작");
	} else if(yId!=i||yPw!=p) {
		System.out.println("로그인 실패");
			} }
		
		for(level=1; level<15; level++) {
			System.out.println("현재 레벨은 "+level);
			if(level%5==0) {
				gold=gold+(level/5)*1000;
				System.out.println("현재 골드는 "+gold);
			}
			for(int mon=0; mon<3*level; mon++) {
				System.out.println(mon+1+"꽥!");
			}
			System.out.println("==============================");
		}
		gold=gold+3000;
		System.out.println("최종 레벨 : " + level);
		System.out.println("최종 골드 : " + gold);
	}

}
