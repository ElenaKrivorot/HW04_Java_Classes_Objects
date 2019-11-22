package by.krivorot.hw04.task06.main;

import by.krivorot.hw04.task06.emtity.Time;
import by.krivorot.hw04.task06.input.TimeInput;
import by.krivorot.hw04.task06.logic.ChangeTime;
import by.krivorot.hw04.task06.view.PrintTime;

public class Main {

	public static void main(String[] args) {
		int hour;
		int min;
		int sec;
		String incrOrDecr;

		Time time1 = new Time(23, 55, 59);
		
		PrintTime print = new PrintTime();
		print.printTime(time1);

		ChangeTime chtime = new ChangeTime();
		chtime.increase(2, 2, 2, time1);
		
		print.printTime(time1);

		TimeInput input1 = new TimeInput();
		hour = input1.inputTime("Enter hour -> ");
		min = input1.inputTime("Enter minute -> ");
		sec = input1.inputTime("Enter second -> ");

		Time time2 = new Time(hour, min, sec);
		incrOrDecr = input1.increaseOrDecrease();
		chtime.changeFromConsole(incrOrDecr, time2);		

		print.printTime(time2);

	}

}
