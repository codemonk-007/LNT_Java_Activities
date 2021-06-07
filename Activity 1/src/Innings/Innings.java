package Innings;

public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	//TEAMNAME
	public String getTeamName() {
		return this.teamname;
	}
	public void setTeamName(String teamname) {
		this.teamname = teamname;
	}
	
	//INNINGS
	public String getInningsName() {
		return this.inningsname;
	}
	public void setInningsName(String inningsname) {
		this.inningsname = inningsname;
	}
	
	//RUNS
	public int getRuns() {
		return this.runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	//DISPLAY DETAILS
	public void displayInningsDetails(){
		int runs = this.getRuns();
		String teamname = this.getTeamName();
		String innings = this.getInningsName();
		
		if (runs < 0) {
			System.out.println("Invalid Output");
			return;
		}
		System.out.println("Name: " + teamname);
		System.out.println("Scored: " + this.getRuns());
		
		if (innings.equals("First")) System.out.println("Need " +(this.getRuns()+1) + " to win");
		else if(innings.equals("Second")) System.out.println("Match Ended");
	}
}
