package by.krivorot.hw04.task07.main;

import by.krivorot.hw04.task07.emptity.Triangle;
import by.krivorot.hw04.task07.logic.TriangleLogik;
import by.krivorot.hw04.task07.view.PrintTriangleValues;

public class Main {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(new double[] { 0, 0 }, new double[] { 0, 3 }, new double[] { 4, 0 });
		TriangleLogik trlogic = new TriangleLogik();

		PrintTriangleValues print = new PrintTriangleValues();
		print.printPointCoordinates("Triangle top A", triangle.getPointA());
		print.printPointCoordinates("Triangle top B", triangle.getPointB());
		print.printPointCoordinates("Triangle top C", triangle.getPointC());
		print.printValues("Perimeter", trlogic.countPerimeter(triangle));
		print.printValues("Square", trlogic.countSquare(triangle));
		print.printPointCoordinates("Median intersection", trlogic.medianIntersection(triangle));

	}

}
