package com.iu.array;

public class Array_6 {

	public static void main(String[] args) {
		//배열의 길이 변경
		int [] nums = {1, 2, 3};
		int [] copy = new int [nums.length-1];
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = nums[i];
					}//깊은 복사
		nums = copy;//주소 복사
		System.out.println(nums.length);
		
		for(int i =0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		

	}

}
