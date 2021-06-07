package Innings;


import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String teamname, inningsname;
		int runs;
		
		Innings innings = new Innings();

		System.out.println("Enter Team Name: ");
		teamname = input.nextLine();
		
		System.out.println("Enter Session: ");
		inningsname = input.nextLine();
		
		System.out.println("Enter Runs: ");
		runs = input.nextInt();
		
		input.close();
		
		innings.setTeamName(teamname);
		innings.setRuns(runs);
		innings.setInningsName(inningsname);
		
		innings.displayInningsDetails();

	}

}
