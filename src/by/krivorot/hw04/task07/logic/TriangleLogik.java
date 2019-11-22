package by.krivorot.hw04.task07.logic;

import by.krivorot.hw04.task07.emptity.Triangle;

public class TriangleLogik {

	public double countSide(double[] a, double[] b) {
		double ab;

		ab = Math.sqrt(Math.pow((b[0] - a[0]), 2) + Math.pow((b[1] - a[1]), 2));
		return ab;
	}

	public double countPerimeter(Triangle triangle) {
		double p;
		double ab;
		double bc;
		double ac;

		ab = countSide(triangle.getPointA(), triangle.getPointB());
		bc = countSide(triangle.getPointB(), triangle.getPointC());
		ac = countSide(triangle.getPointA(), triangle.getPointC());
		p = ab + bc + ac;
		return p;
	}

	public double countSquare(Triangle triangle) {
		double p;
		double ab;
		double bc;
		double ac;
		double s;

		p = countPerimeter(triangle) / 2;
		ab = countSide(triangle.getPointA(), triangle.getPointB());
		bc = countSide(triangle.getPointB(), triangle.getPointC());
		ac = countSide(triangle.getPointA(), triangle.getPointC());
		s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
		return s;
	}

	public double[] medianIntersection(Triangle triangle) {
		double[] middleAB;
		double[] middleBC;
		double[] kb1;
		double[] kb2;
		double x;
		double y;

		middleAB = findMiddlePoint(triangle.getPointA(), triangle.getPointB());
		middleBC = findMiddlePoint(triangle.getPointB(), triangle.getPointC());

		kb1 = dirrectEquationCoefficients(triangle.getPointC(), middleAB);
		kb2 = dirrectEquationCoefficients(triangle.getPointA(), middleBC);

		y = (kb1[1] - kb2[1] * kb1[0] / kb2[0]) / (1 - kb1[0] / kb2[0]);
		x = (y - kb1[1]) / kb1[0];

		double[] medianIntersection = new double[] { x, y };

		return medianIntersection;

	}

	public double[] findMiddlePoint(double[] a, double[] b) {
		double x;
		double y;

		x = (a[0] + b[0]) / 2.0;
		y = (a[1] + b[1]) / 2.0;
		double[] mas = new double[] { x, y };

		return mas;

	}

	public double[] dirrectEquationCoefficients(double[] a, double[] c) {
		double k;
		double b;

		k = (a[1] - c[1]) / (a[0] - c[0]);
		b = a[1] - a[0] * k;
		double[] mas = new double[] { k, b };

		return mas;

	}

}
