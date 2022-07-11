package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random random = new Random ();
		//몬스터 기본 정보
		String [] monsterNames = {"고블린", "오크", "슬라임", "구울"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 설정(마법사 클래스)
		
		System.out.println("캐릭터 이름 설정");
		String name = sc.next();
		
		//파이어볼로 공격
		
		int magicPower = 6;
		
		boolean check = true;
		
		
		
		//몬스터 파티 생성
		//몬스터 수 입력 (1-4)
		//HP: 최소 반피에서 최대 피통까지
		//입력한 수만큼 몬스터를 랜덤하게 뽑고 출력
		
//		int num= random.nextInt(4);
//		System.out.println(num+1);
		System.out.println("몬스터 수 입력");
		int num=sc.nextInt();
		String [] monsterPartyNames = new String [num];
		int [] monsterPartyHps = new int [num];
		
		for (int i=0; i<monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i]=monsterNames[index];
			monsterPartyHps[i]=monsterHps[index];
			}

		//1회성 공격
		//0-6 미만 사이의 랜덤한 데미지로 몬스터를 공격//3
		//1.사냥 2.도망
		

		for(int i=0; i<monsterPartyNames.length; i++) {
		System.out.println(monsterPartyNames[i]+"이(가) 나타났다" +"(HP: "+ monsterPartyHps[i]+")");
		}
		
		while(check) {
			int death=0;
			System.out.println("1. 사냥    2. 도망"); 
			int select = sc.nextInt();
			if(select==1) {
				for(int n=0; n<monsterPartyNames.length; n++) {
					int d = random.nextInt(magicPower);
					monsterPartyHps[n] = monsterPartyHps[n]-d;
					System.out.println(monsterPartyNames[n]+"에게 "+d+"의 데미지를 입혔다" +"\n현재 HP: "+ monsterPartyHps[n]);
						if(monsterPartyHps[n]<1) {
							death++;
							System.out.println(monsterPartyNames[n]+" 를(을) 해치웠다");
						}
				}
				}
			else {System.out.println("도망갔다");								
				break;
			}
			System.out.println("사냥한 몬스터 수: "+death);
			}//while 끝
		}
		
		
		
		
		

	}


