package by.krivorot.hw04.task07.emptity;

public class Triangle {
	private double[] pointA = new double[2];
	private double[] pointB = new double[2];
	private double[] pointC = new double[2];

	public Triangle() {

	}

	public Triangle(double[] pointA, double[] pointB, double[] pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public double[] getPointA() {
		return pointA;
	}

	public void setPointA(double[] pointA) {
		this.pointA = pointA;
	}

	public double[] getPointB() {
		return pointB;
	}

	public void setPointB(double[] pointB) {
		this.pointB = pointB;
	}

	public double[] getPointC() {
		return pointC;
	}

	public void setPointC(double[] pointC) {
		this.pointC = pointC;
	}
	
	

}
