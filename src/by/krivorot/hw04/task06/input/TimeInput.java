package by.krivorot.hw04.task06.input;

import java.util.Scanner;

public class TimeInput {

	public int inputTime(String mes) {
		int x;

		System.out.println(mes);
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mes);
		}
		x = sc.nextInt();

		return x;

	}

	public String increaseOrDecrease() {
		String x;

		System.out.println("What do you want: increase time, than enter I, or decrease time, than enter D");
		Scanner id = new Scanner(System.in);
		x = id.next();
		while (!x.equals("d") && !x.equals("D") && !x.equals("i") && !x.equals("I")) {
			System.out.println("Enter I or D");
			x = id.next();
		}

		return x;

	}

}
