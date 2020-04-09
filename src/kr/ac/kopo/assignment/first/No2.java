package kr.ac.kopo.assignment.first;

import java.util.Scanner;

public class No2 {
	/*
	 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오 ( 입력 받기!! )
	 */
	
	public static void main(String[] args) {
		
		//환산할 초 입력받기
		System.out.print("초를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int secInput = sc.nextInt();
		sc.nextLine();
		
		// System.out.println(seconds);
		
		//초를 시간, 분, 초로 환산하기
		int hour = secInput / 3600;
		int min = (secInput % 3600) / 60;
		int sec = (secInput % 3600) % 60;

		//결과 출력하기
		System.out.printf("%d초 : %d시간 %d분 %d초 --> ", secInput, hour, min, sec);
		
			
		//0이 들어간 시,분,초 없애기
		
		//시가 0일때
		if(hour == 0) { 
			if(min == 0) {
				System.out.printf("%d초\n", sec);				
			}
			else {
				if(sec == 0) {
					System.out.printf("%d분 \n", min);					
				}
				else {
					System.out.printf("%d분 %d초\n", min, sec);					
				}				
			}
		}
		
		//시가 0이 아닐때
		else {
			if(min == 0) {
				if(sec == 0) {
					System.out.printf("%d시간\n", hour);
					} 
				else { 
						System.out.printf("%d시간 %d초\n", hour, sec); 
					} 
			}
			else {
				if(sec == 0) {
					System.out.printf("%d시간 %d분\n", hour, min);
					}
				else {
					System.out.printf("%d시간 %d분 %d초\n", hour, min, sec);
					}
				}
		}
		
	}

}
