package by.krivorot.hw04.task07.view;

public class PrintTriangleValues {

	public void printValues(String mes, double value) {
		System.out.println(mes + " = " + value);
	}

	public void printPointCoordinates(String mes, double[] value) {
		System.out.print(mes + " (");
		System.out.printf("%.2f", value[0]);
		System.out.print(";");
		System.out.printf("%.2f", value[1]);
		System.out.print(")");
		System.out.println();

	}

}
