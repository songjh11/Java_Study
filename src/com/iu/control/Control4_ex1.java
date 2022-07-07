package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국어 영어 수학 입력
		//총점 평균 계산
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그 외는 F

		Scanner sc = new Scanner (System.in);
				
		int kor = 0;
		int eng = 0;
		int math = 0;
								
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int total = kor+eng+math;
		int avg = total/3;
			
		switch(avg/10) {
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		case 7 : 
			System.out.println("C");
			break;
		case 6 : 
			System.out.println("D");
			break;
		default : 
			System.out.println("F");
		}
		
	}

}
