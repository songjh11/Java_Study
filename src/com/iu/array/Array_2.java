package com.iu.array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		//배열은 어떤 데이터 타입이든 상관X
		//모으려고 하는 데이터 타입 [] 변수명 = new 모으려고 하는 데이터 타입[숫자];
		String [] names = new String[3];
		names[0] = "iu";
		names[1] = "choa";
		names[2] = "suzy";
//		names[3] = "";//<-여기선 에러가 안 뜨는데 실행창에서 에러 뜸, 배열의 영역을 벗어났으니까
		int [] nums = new int [3];//<-nums라는 변수엔 현재 배열의 주소가 들어감
		String [] names1 = new String [3];
		System.out.println(nums[0]);
		System.out.println(names1[0]);
		Scanner [] sc = new Scanner [2];
		
		int [] nums2 = {1, 4, 52}; //<-방을 3개 만들면서 각각 값을 대입하겠다는 뜻
		int nums3 [];//<-틀린건 아니지만 프로그램은 왼쪽부터 읽으니까 될 수 있으면 괄호가 먼저 나오게 쓰기
		

	}

}
