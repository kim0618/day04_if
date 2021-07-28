package day04_if;

import java.util.Scanner;

public class Ex06_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//String name;
		//int num=0;
		/*if(num == 1) {
			name = "test";
		}
		System.out.println(name);
		*/
		/*while(true)
		{
			System.out.println("이름 입력 : ");
			name = input.next();
			System.out.println("당신의 이름은 "+name+" 이군요");
		}
		*/
		
	/*	int num=0;
		while(true){
			System.out.println("입력 날짜 : ");
			num = input.nextInt();
			num = num%7;
			switch(num) {
			case 1: 
				System.out.println(num+" : 월요일");break;
			case 2: 
				System.out.println(num+" : 화요일");break;
			case 3: 
				System.out.println(num+" : 수요일");break;
			case 4: 
				System.out.println(num+" : 목요일");break;
			case 5: 
				System.out.println(num+" : 금요일");break;
			case 6: 
				System.out.println(num+" : 토요일");break;
			case 7: 
				System.out.println(num+" : 일요일");break;
			}
		}
		*/
		
		String home = "";
		String com = "";
		int num;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("우리집 목적지 입력 : ");
				home = input.next();
				System.out.println("등록 성공");
				break;
			case 2:
				System.out.println("회사 목적지 입력 : ");
				com = input.next();
				System.out.println("등록 성공");
				break;
			case 3:
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+com);
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
