package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("1-5사이의 숫자를 입력");
		int num = sc.nextInt();
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		if(num==1) {
			ch=(char)(ch+num);
			if(ch>=122) { System.out.println((char)(ch-26));}
			else {System.out.println((char)ch);}
		} 
		
		if (num==2) {
			ch=(char)(ch+num);
			if(ch>=122) { System.out.println((char)(ch-26));}
			else {System.out.println((char)ch);
		}}
			
			if (num==3) {
			ch=(char)(ch+num);
			if(ch>=122) { System.out.println((char)(ch-26));}
			else {System.out.println((char)ch);
	}} 
			if(num==4) {
		ch=(char)(ch+num);
		if(ch>=122) { System.out.println((char)(ch-26));}
		else {System.out.println((char)ch);
	}} 
			if(num==5) {
		ch=(char)(ch+num);
		if(ch>=122) { System.out.println((char)(ch-26));}
		else {System.out.println((char)ch);
	}}
	
	
	
	}

}
