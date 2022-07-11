package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {
		int [] nums1 = {1, 2, 3};
		System.out.println(nums1.length);
		int [] nums2 = nums1;
		//얕은 복사<-해당 배열을 가리키는 주소만 복사
		System.out.println(nums2.length);
		
		int [] nums3 = new int [3]; //Heap영역에 새로운 배열 생성
		for(int i=0; i<nums1.length; i++) {
			nums3[i]=nums1[i];
		}//다른 주소에 있는 배열의 값을 가져와 저장, 깊은 복사

		nums2[0] = 9;
		nums3[0] = 100;
		
		System.out.println(nums1[0]);
		System.out.println(nums3.length); 
				
		nums3 = new int [5];
		System.out.println(nums3[0]); 
		System.out.println(nums3.length);
		System.out.println(nums3); 
	}

}
