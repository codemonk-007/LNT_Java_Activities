package Match;

public class TestMatch extends Match {

	@Override
	public double calculateRunRate() {
		int reqRun = this.getTarget() - this.getCurrentScore();
		int overs = 90 - this.getCurrentOver();
		return (double)reqRun/overs;
	}

	@Override
	public int calculateBalls() {
		return (90-this.getCurrentOver())*6;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		System.out.println("Requirements: ");
		System.out.println("Need " + (this.getTarget()-this.getCurrentScore()) + " runs in " + balls + " balls");
		System.out.println("Required Runrate: " + reqRunrate);
	}

}
