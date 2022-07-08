package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yId=1234;
		int yPw=5678;
		boolean check= true;//종료시 사용
		boolean start = false;//로그인 성공시 사용
		
		int gold = 1000;
		int exp = 0;
		int gold2 = 0;
		int lv = 1;
		//회원가입한 아이디, 비밀번호를 사용하여 로그인 성공할때까지 while문 사용
		//아이디 입력, 비밀번호 입력
		//로그인 판단 후 성공하면 종료, 실패하면 다시 입력
	
		
//		while(check) {
//			System.out.println("아이디를 입력하세요");
//			int i = sc.nextInt();
//			System.out.println("비밀번호를 입력하세요");
//			int p = sc.nextInt();
//			if(yId==i&&yPw==p) {
//			System.out.println("로그인 성공");
//			check=!check;
//		} else if(yId!=i||yPw!=p) {
//			System.out.println("로그인 실패");
//			System.out.println("1.로그인 재시도 2.종료");
//			int select = sc.nextInt();
//			if (select==1) {
//		} else if(select==2) {
//			check=!check;
//			System.out.println("종료");
//		}
//		else {
//			System.out.println("1-2만 선택이 가능합니다");
//		}
//		}
//	}
//		while(check) {
//			System.out.println("1. 로그인시도 2. 종 료");
//			int select=sc.nextInt();
//			switch(select) {
//			case 1:
//			System.out.println("아이디를 입력하세요");
//			int i = sc.nextInt();
//			System.out.println("비밀번호를 입력하세요");
//			int p = sc.nextInt();
//		break;
//			case 2 :
//				check=!check;
//				System.out.println("종 료");
//				break;
//			default:
//				check=!check;
//			}
//		}while 끝
//===============================================================
		//로그인을 안했으면 프로그램이 종료
		//로그인을 성공했으면 게임 시작
		//RPG게임 
		//시작 레벨은 1
		//만렙 15
		//gold : 1000;
		//모든 몬스터의 경험치는 동일
		//1->2 : 몬스터 3마리 잡아야 렙업
		//2->3 : 몬스터 6마리 잡아야 렙업
		//3->4 : 몬스터 9마리 잡아야 렙업
		//4->5 : 몬스터 12마리 잡아야 렙업
		//14->15 : 42
		//15: 프로그램 종료
		//5렙 달성 시 축하금으로 1000 gold 지급
		//10렙 달성 시 축하금으로 2000 gold 지급
		//15렙 달성 시 축하금으로 3000 gold 지급
		 
		
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
	if(start = true) {
		for(lv = 1; lv<=15; lv++) {
			System.out.println("현재 레벨: "+lv);
				if(lv%5==0) {
					gold2=gold+((lv/5)*1000);
							System.out.println("골드: "+gold2);
						} 
					break;
				}
				}
		
				while(exp<(lv*3))  {
				exp++;
				System.out.println("사냥");
			}			
				exp=0;
				System.out.println("최종 레벨: "+lv);
				System.out.println("최종 골드: "+gold2);
		//for끝
//	else if(yId!=i||yPw!=p) {
//	System.out.println("로그인 실패");
//	System.out.println("1.로그인 재시도 2.종료");
//	int select = sc.nextInt();
//	if (select==1) {
//} else if(select==2) {
//	check=!check;
//	System.out.println("종료");
//}
//}
//		
		
	}//While끝
	}




