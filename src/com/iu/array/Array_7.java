package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {
		int [] ar = {10, 22, 3, 14, 51};
		//내림차순 정렬
		//인덱스0이랑 인덱스1이랑 비교해서 더 큰 수가 앞으로 가게 자리바꾸기->더이상 바꿀 수 없을때까지
		for(int i=0; i<ar.length-1; i++) {
			//i=0, 1234
			//i=1, 234
			//i=2, 34
			//i=3, 4
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) { 
					int tmp = ar[j];
					ar[j]=ar[i];
					ar[i]=tmp;
			}
				
			}
		}
		
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
