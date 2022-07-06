package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로부터 국어, 영어, 수학 점수를 차례로 입력
		//총점과 평균을 계산
		//평균이 90점 이상이면 우등상 수상
		//모든 학생들은 졸업 출력
		
		//평균이 90점 이상이면 A학점 출력,
		//평균이 80점 이상이면 B학점 출력,
		//평균이 70점 이상이면 c학점 출력,
		//평균이 60점 이상이면 D학점 출력
		//그 외 나머지는 F학점 출력
		
		Scanner sc = new Scanner (System.in);
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int score=0;
		double e=0;
		
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		mat = sc.nextInt();
		
		score = kor+eng+mat;
		e = score/3.0;
		
		if(e>=90) {
			System.out.println("A학점\n우등상 수상");
		}
		if(e>=80&&e<90) {
			System.out.println("B학점");
		}
		if(e>=70&&e<80) {
			System.out.println("C학점");
		}
		if(e>=60&&e<70) {
			System.out.println("D학점");
		}
		if(e<60) {
			System.out.println("F학점");
		}
		System.out.println("졸업을 축하합니다");
	}

}
