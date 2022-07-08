package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
//		int num = random.nextInt(10);
//		System.out.println(num);
//nextInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아준다
		
		//가위바위보
		//가위: 0
		//바위: 1
		//보: 2
		//사용자가 숫자를 입력하고 
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우 종료
		//비기거나 지면 다시 실행
		int na = 0;
		int num = 0;
		boolean v = true; 
		boolean check = true;
		
//		while(v) {
//			System.out.println("가위 바위 보");
//		na=sc.nextInt();
//		System.out.println("나: "+na);	
//		num = random.nextInt(3);
//		System.out.println("컴퓨터: "+num);
//		if(na==0&&num==2||na==1&&num==0||na==2&&num==1) {
//			System.out.println("이겼다!");
//			v=!v;
//		} else if(na==num) {
//			System.out.println("비겼다");
//		} else if(na==0&&num==1||na==1&&num==2||na==2&&num==0) {
//			System.out.println("졌다");
//		}
//
//	}
		while(check) {
			System.out.println("0.가위 1.주먹 2.보");
			int you = sc.nextInt();
			int com = random.nextInt(3);
			System.out.println("You: "+you+" Com: "+com);
			if(com==0&&you==2) {//com이 이겨야 될 때
				you=-1;
			}
			if(com==2&&you==0) {//내가 이겨야 될 때
				com=-1;
			}
			if(com<you) {
				System.out.println("You Win!");
				break;
			} else if(com==you) {
				System.out.println("Even!");
			} else {
				System.out.println("Com Win!");
			}
		}

}
}