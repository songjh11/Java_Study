package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {

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
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		int total = kor+eng+math;
		double av = total/3;
		
		if(av>=90) {
			System.out.println("A");
		} else if (av>=80) {
			System.out.println("B");
		} else if (av>=70) {
			System.out.println("C");
		} else if (av>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
System.out.println("수고하셨습니다");
	}

}
