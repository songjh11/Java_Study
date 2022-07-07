package com.iu.loop;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		int idx = 220;
		for(idx = 0; idx<5; idx++) {//i=i+1
			System.out.println("Hello World!");
			}
		
		//for(초기식, 조건식, 증감식){}
		for(int i = 0; i<5; i++) {//i=i+1
		System.out.println("Hello World!");
		}
		
		int count = 0;
		for(int i=0; i<10; i++) {
			System.out.println(i);
			count++;
			
		}
		
		
		System.out.println("Finish");

	}

}
