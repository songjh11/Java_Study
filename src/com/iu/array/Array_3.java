package com.iu.array;

public class Array_3 {

	public static void main(String[] args) {
		int [] nums = new int [3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int [] nums2 = nums;//<-배열을 가리키는 주소가 담긴 nums를 대입
		
		System.out.println(nums2[2]);
		
		nums2[0] = 99;
		System.out.println(nums[0]);//<-얕은 복사
		

	}

}
