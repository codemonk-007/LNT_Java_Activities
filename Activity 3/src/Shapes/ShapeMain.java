package Shapes;
import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double area = 0;
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the Shape: ");
		String shape = input.next();
		while (!shape.equals("Circle") && !shape.equals("Square")) {
			System.out.println("Invalid Input! Try Again: ");
			shape = input.next();
		}
		System.out.println("Enter the Radius: ");
		int radius = input.nextInt();
		
		if (shape.equals("Circle")) {
			Circle circle = new Circle();
			area = circle.calculateArea(radius);
		}
		else {
			Square square = new Square();
			area = square.calculateArea(radius);
		}
		System.out.println(area);
		input.close();
		
		
	}

}
