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
		
		int result = ch+num;
		//소문자가 범위를 벗어났을때
		if(result>'z') { 
			result = result - 'z'-1;
			result = 'a'+result;
		}
		//대문자가 범위를 벗어났을때
		if(result>'Z'&&result<'a') { 
			result = result - 'Z' -1;
			result = result + 'A';
		}
		
		ch = (char)result;
		
		System.out.println(ch);
	
	}

}



