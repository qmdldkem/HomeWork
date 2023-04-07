package day_0404;

public class Example1 {

	public static void main(String[] args) {
		int x = -10;
		int absX = (x>= 0)?x:-x;
		
		int score = 50;
		char grade = (score>=90)?'A':(score >=80?'B':'C');
		System.out.println(absX);
		System.out.println(grade);
		
		// score =>  89~80
		int score1 =0;
		
		boolean score2 = score1>=80 && score1<=89;
		
		System.out.println(score2);
		
	}

}
