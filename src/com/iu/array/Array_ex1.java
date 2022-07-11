package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//키보드로부터 인원수를 입력받아서
		//인원수만큼 이름을 입력 받아서
		//입력된 이름들을 출력
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("인원 수 입력");
		int a = sc.nextInt();
	
		String [] names = new String [a];
		int [] kor = new int [a];
		int sum = 0;
		
		for(int i=0; i<names.length; i++) {
			System.out.println(i+1+"번 이름 입력");
			names[i]=sc.next();
			}
		for(int i=0; i<names.length; i++) {
		System.out.println("이름: "+names[i]);
		}
		//학생의 이름별로 국어 점수 입력 후 출력
		
//		for(int i=0; i<names.length; i++) {
//			System.out.println("이름 입력");
//			names[i]=sc.next();
//		}
		for(int k=0; k<kor.length; k++) {
			System.out.println(names[k]+"의 국어 점수 입력");
			kor[k]=sc.nextInt();
		} for(int i=0; i<names.length; i++){
		System.out.println("이름: "+names[i]+" 국어 점수: "+kor[i]);}

		//반의 국어 총점을 계산하고 출력
		
		for(int i =0; i<names.length; i++) {
			sum = sum+kor[i];
		} System.out.println("총점 : "+sum);
		
	}

}
