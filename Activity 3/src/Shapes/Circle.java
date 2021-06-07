package Shapes;

public class Circle extends Shape {
	@Override
	public double calculateArea(int value) {
		return Math.PI * value * value;
	}

}
