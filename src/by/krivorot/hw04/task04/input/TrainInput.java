package by.krivorot.hw04.task04.input;

import java.util.Scanner;

public class TrainInput {

	public int inputTrainNumber() {
		int x;

		System.out.println("Enter train number");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter train number");
		}
		x = sc.nextInt();

		return x;
		
	}

}
