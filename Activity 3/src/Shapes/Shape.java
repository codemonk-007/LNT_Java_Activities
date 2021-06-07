package Shapes;
public abstract class Shape {
	private int value;
	
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public abstract double calculateArea(int value);
}
