package by.krivorot.hw04.task06.view;

import by.krivorot.hw04.task06.emtity.Time;

public class PrintTime {

	public void printTime(Time time) {
		int hour;
		int min;
		int sec;

		System.out.println("Time is:");
		hour = time.getHour();
		if (hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour + ".");

		min = time.getMinute();
		if (min < 10) {
			System.out.print("0");
		}
		System.out.print(min + ".");

		sec = time.getSecond();
		if (sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec + ".");
		System.out.println();
	}
}
