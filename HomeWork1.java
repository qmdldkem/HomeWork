package Test01;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요 ex)012345-0123456");
		String str = sc.nextLine();
		
		// ex) String no = "123456-7891234";
		
		String sido = str.substring(8,10);
		
		int temp = Integer.parseInt(sido);
		
		if(temp>=0 && temp<=8) {
			System.out.println("서울에서 태어나셨습니다.");
		}else if(temp>=9 && temp<=12) {
			System.out.println("부산에서 태어나셨습니다.");
		}else if(temp>=13 && temp<=15) {
			System.out.println("인천에서 태어나셨습니다.");
		}else if(temp>=16 && temp<=25) {
			System.out.println("경기도에서 태어나셨습니다.");
		}else if(temp>=16 && temp<=34) {
			System.out.println("강원도에서 태어나셨습니다.");
		}else if(temp>=35 && temp<=39) {
			System.out.println("부산에서 태어나셨습니다.");
		}else if(temp==40) {
			System.out.println("대전에서 태어나셨습니다.");
		}else if(temp>=40 && temp<=47) {
			System.out.println("충남에서 태어나셨습니다.");
		}else if(temp==44 || temp==96) {
			System.out.println("세종특별시에서 태어나셨습니다.");
		}else if(temp>=55 && temp<=66) {
			System.out.println("전북에서 태어나셨습니다.");
		}else if(temp==65 || temp==66) {
			System.out.println("광주에서 태어나셨습니다.");
		}else if(temp==67 || temp==81) {
			System.out.println("경북에서 태어나셨습니다.");
		}else if(temp>=81 && temp<=91) {
			System.out.println("경남에서 태어나셨습니다.");
		}else if(temp==85) {
			System.out.println("울산에서 태어나셨습니다.");
		}else if(temp>=91 && temp<=95) {
			System.out.println("제주에서 태어나셨습니다.");
		}
		
		sc.close();
	}

}
