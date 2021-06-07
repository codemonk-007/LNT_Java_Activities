package Match;
import java.util.Scanner;

public class MatchMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the match format \n1.ODI \n2.T20 \n3.Test");
		
		String choice = input.next();
		
		while(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
			System.out.println("Invalid Input! Try Again: ");
			choice = input.next();
		}
		
		System.out.println("Enter the Current score");
		int currentscore = input.nextInt();
		
		System.out.println("Enter the Current over");
		int currentover = input.nextInt();
		
		System.out.println("Enter the Target Score");
		int targetscore = input.nextInt();
		
		switch(choice) {
		case "1":
			ODIMatch match1 = new ODIMatch();
			match1.setCurrentOver(currentover);
			match1.setCurrentScore(currentscore);
			match1.setTarget(targetscore);
			
			match1.display(match1.calculateRunRate(),match1.calculateBalls());
			break;
		case "2":
			T20Match match2 = new T20Match();
			match2.setCurrentOver(currentover);
			match2.setCurrentScore(currentscore);
			match2.setTarget(targetscore);
			
			match2.display(match2.calculateRunRate(),match2.calculateBalls());
			break;
		case "3":
			TestMatch match3 = new TestMatch();
			match3.setCurrentOver(currentover);
			match3.setCurrentScore(currentscore);
			match3.setTarget(targetscore);
			
			match3.display(match3.calculateRunRate(),match3.calculateBalls());
			break;
		}
	input.close();
	}
}
