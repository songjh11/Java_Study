package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적 프로그램
		//1. 학생 정보 입력
		//1-1 학생 수 입력
		//1-2 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
		//2. 학생 정보 조회
		//2-1 모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 학생 정보 검색
		//3-1 검색할 학생의 번호 입력
		//3-2 입력한 번호와 일치하는 학생의 모든 정보 출력
		//3-3 일치하는 번호가 없으면 없는 번호입니다 출력
		//4. 학생 정보 삭제
		//4-1 삭제할 학생의 번호를 입력
		//4-2 일치하는 학생의 정보를 삭제(배열을 한칸 줄인다)
		//4-3 일치하는 번호가 없으면 없는 번호입니다 출력
		//5. 학생 정보 추가
		//5-1 학생의 정보 입력(배열 한칸을 더 늘린다)
		//6. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int num1 = 0;
		String [] name = null;
		int [] nums = null;
		int [] kor = null;
		int [] eng = null;
		int [] math = null;
		int [] total = null;
		double [] avg = null;
		
		
		while(check) { 
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("학생 수 입력");
				num1 = sc.nextInt();
				name = new String [num1];
				nums = new int [name.length];
				kor = new int [name.length];
				eng = new int [name.length];
				math = new int [name.length];
				total = new int [name.length];
				avg = new double [name.length];
					for(int i=0; i<name.length; i++) {
						System.out.println("이름 입력");
						name[i] = sc.next();
						System.out.println("번호 입력");
						nums[i] = sc.nextInt();
						System.out.println("국어 점수 입력");
						kor[i] = sc.nextInt();
						System.out.println("영어 점수 입력");
						eng[i] = sc.nextInt();
						System.out.println("수학 점수 입력");
						math[i] = sc.nextInt();
						total[i] = kor[i]+eng[i]+math[i];
						avg[i] = total[i]/3; }//for 끝
				System.out.println("입력 끝");
			} else if(select==2) {
				System.out.println("학생 정보 조회 출력");
				if(name!=null) {
					System.out.println("Name\tNum\tTotal\tAvg");
					for(int i=0; i<name.length; i++) {	
						System.out.println(name[i]+"\t"+nums[i]+"\t"+total[i]+"\t"+avg[i]);
					}
					System.out.println("출력 끝");
				} else {
					System.out.println("학생 정보가 없습니다");
				}
			} else if(select==3) {
				System.out.println("검색할 학생 번호 입력");
				select = sc.nextInt();
				boolean flag = false;
				for(int i=0; i<name.length; i++) { 
					if(select==nums[i]) {
						System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
						System.out.println(name[i]+"\t"+nums[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+total[i]+"\t"+avg[i]);
					flag=!flag;
					break;
					} }
					if(flag==false) {
						System.out.println("해당 학생 번호는 없는 번호입니다");
						} 
			
				System.out.println("검색 출력 끝");
						
			} else if(select==4) {
					System.out.println("삭제할 학생 번호 입력");
					int b = sc.nextInt();
					boolean flag = false;
					String [] name2 = null;
					int [] nums2 = null;
					int [] kor2 = null;
					int [] eng2 = null;
					int [] math2 = null;
					int [] total2 = null;
					double [] avg2 = null;
					int i = 0;
					for(i=0; i<name.length; i++) {
					if(b==nums[i]) {
						flag=!flag;
						break;						
						}
					}
					if(flag) {//이게 뭔뜻인지 모르겠다~~~~~~~~~
					name2 = new String [name.length-1];
					nums2 = new int [name2.length];
					kor2 = new int [name2.length];
					eng2 = new int [name2.length];
					math2 = new int [name2.length];
					total2 = new int [name2.length];
					avg2 = new double [name2.length];
					int index=0;
					for(int j=0; j<name.length; j++) {
						if(j==i) {
							index--;
							continue;
						}
						name2[index] = name[j];
						nums2[index] = nums[j];
						kor2[index] = kor[j];
						eng2[index] = eng[j];
						math2[index] = math[j];
						total2[index] = total[j];
						avg2[index] = avg[j];
					}
						name=name2;
						nums=nums2;
						kor=kor2;
						eng=eng2;
						math=math2;
						total=total2;
						avg=avg2;
									
				} else {
						System.out.println("해당 학생 번호는 없는 번호입니다");
				}
					System.out.println("학생 삭제 끝");
		}	else if(select==5) {
					String [] name2 = new String[name.length+1];
					int [] nums2 = new int [name2.length];
					int [] kor2 = new int[name2.length];
					int [] eng2 = new int [name2.length];
					int [] math2 = new int [name2.length];
					int [] total2 = new int [name2.length];
					double [] avg2 = new double [name2.length];
					
					for(int i=0; i<name.length; i++) {
						name2[i] = name[i];
						nums2[i] = nums[i];
						kor2[i] = kor[i];
						eng2[i] = eng[i];
						math2[i] = math[i];
						total2[i] = total[i];
						avg2[i] = avg[i];
				}
					System.out.println("이름 입력");
					name2[name.length] = sc.next();
					System.out.println("번호 입력");
					nums2[name.length] = sc.nextInt();
					System.out.println("국어 점수 입력");
					kor2[name.length] = sc.nextInt();
					System.out.println("영어 점수 입력");
					eng2[name.length] = sc.nextInt();
					System.out.println("수학 점수 입력");
					math2[name.length] = sc.nextInt();
					total2[name.length] = kor2[name.length]+eng2[name.length]+math2[name.length];
					avg2[name.length] = total2[name.length]/3;
					
					name=name2;
					nums=nums2;
					kor=kor2;
					eng=eng2;
					math=math2;
					total=total2;
					avg=avg2;
					System.out.println("학생 추가 끝");}
					else {
							break;}
					
		} //while 끝	
				System.out.println("프로그램 종료");

			 
				
						
			
		
		
		}
		}

