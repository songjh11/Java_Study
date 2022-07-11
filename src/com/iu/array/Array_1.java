package com.iu.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		//배열 선언
		//변수 선언 공식
		//데이터타입 변수명;
		String name;//<-name은 String 타입
		Scanner sc;//<-sc는 Scanner 타입
		int age = 30;
		//모으려고 하는 데이터 타입 [] 변수명;
		//모으려고 하는 데이터 타입 [] 변수명 = new 모으려고 하는 데이터 타입 [숫자];
		int [] nums = new int[3];//<-nums라는 변수 선언, 데이터 타입은 int가 아님, 참조형! 
		char [] names = new char[2];
		
		nums[1]=age;//<-nums배열의 2번째 방에 지역변수 age를 저장
		nums[2]=50;//<-nums배열의 3번째 방에 저장
		nums[0]=10;//<-nums배열의 1번째 방에 저장
		
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[1]);//<-30
		System.out.println(nums[2]);
		System.out.println(nums[0]);
		
		names[0]='a';//<-names배열의 1번째 방에 저장
		names[1]='한';//<-names배열의 2번째 방에 저장
		
		System.out.println(names[0]);
		System.out.println(names[1]);
				

	}

}
