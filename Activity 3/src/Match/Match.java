package Match;

public abstract class Match {
	private int currentscore;
	private int currentover;
	private int target;
	
	public void setCurrentScore(int value) {
		this.currentscore = value;
	}
	public int getCurrentScore() {
		return this.currentscore;
	}
	
	public void setCurrentOver(int value) {
		this.currentover = value;
	}
	public int getCurrentOver() {
		return this.currentover;
	}
	
	public void setTarget(int value) {
		this.target = value;
	}
	public int getTarget() {
		return this.target;
	}
	
	public abstract double calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunrate, int balls);
}
