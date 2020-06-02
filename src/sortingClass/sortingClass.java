package sortingClass;

import java.util.Scanner;

public class sortingClass {
	// 멤버 변수(두 가지 이상 처리(메소드)에서 접근해야 하는 경우)
	int number[];
	boolean updown;
	
	// 처리
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정렬할 갯수 =");
		int count = sc.nextInt();
		
		number = new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print((i+1)+"번 째 수를 입력하세요 = ");
			number[i] = sc.nextInt();
		}
		
		System.out.print("오름차순(1)/내림차순(2) =");
		int ud = sc.nextInt();
		updown=(ud==1)?true:false;
	}
	
	public void Sorting() {
		for (int i = 0; i < number.length-1; i++) {
			for (int j = i+1; j < number.length; j++) {
				if(updown) {
					if(number[i]>number[j]) {
							swap(i,j);
					}
				}
				else {
					if(number[i]<number[j]) {
						swap(i,j);
				}
				}
			}
		}
	}
	
	public void swap(int i,int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
		
	}
	
	public void result() {
		for (int i = 0; i < number.length; i++) {
			System.out.println((i+1)+" : "+number[i]);
		}
	}
}
