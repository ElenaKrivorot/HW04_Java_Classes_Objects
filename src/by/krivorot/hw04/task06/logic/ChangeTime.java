package by.krivorot.hw04.task06.logic;

import by.krivorot.hw04.task06.emtity.Time;
import by.krivorot.hw04.task06.input.TimeInput;

public class ChangeTime {

	public void increase(int hour, int minute, int second, Time time) {
		int seconds = conversionToSecond(hour, minute, second);
		int[] newtime = conversionToTime(seconds);
		int sec;
		int min;
		int h;

		sec = time.getSecond() + newtime[2];
		time.setSecond(sec % 60);
		min = sec / 60 + time.getMinute() + newtime[1];
		time.setMinute(min % 60);
		h = min / 60 + time.getHour() + newtime[0];
		time.setHour(h % 24);
	}

	public int conversionToSecond(int hour, int minute, int second) {
		second = (hour * 3600 + minute * 60 + second) % (24 * 60 * 60);
		return second;
	}

	public int[] conversionToTime(int second) {
		int h;
		int m;
		int s;

		h = second / 3600;
		second = second - (h * 3600);
		m = second / 60;
		s = second % 60;

		int[] time = new int[] { h, m, s };

		return time;
	}

	public void decrease(int hour, int minute, int second, Time time) {
		int seconds = conversionToSecond(hour, minute, second);
		int[] newtime = conversionToTime(seconds);
		int sec = 0;
		int min = 0;
		int h = 0;

		sec = time.getSecond() - newtime[2];
		if (sec < 0) {
			time.setSecond(sec + 60);
			min = min - 1;
		} else {
			time.setSecond(sec);
		}

		min = min + time.getMinute() - newtime[1];
		if (min < 0) {
			time.setMinute(min + 60);
			h = h - 1;
		} else {
			time.setMinute(min);
		}

		h = h + time.getHour() - newtime[0];
		if (h < 0) {
			time.setHour(h + 24);
		} else {
			time.setHour(h);
		}
	}

	public void changeFromConsole(String incrOrDecr, Time time) {
		int hour;
		int min;
		int sec;

		TimeInput input2 = new TimeInput();

		if (incrOrDecr.equals("I") || incrOrDecr.equals("i")) {
			System.out.println("Enter the time for which you want to switch the clock");
			hour = input2.inputTime("Enter hour -> ");
			min = input2.inputTime("Enter minute -> ");
			sec = input2.inputTime("Enter second -> ");
			increase(hour, min, sec, time);
		}

		if (incrOrDecr.equals("D") || incrOrDecr.equals("d")) {
			System.out.println("Enter the time for which you want to switch the clock");
			hour = input2.inputTime("Enter hour -> ");
			min = input2.inputTime("Enter minute -> ");
			sec = input2.inputTime("Enter second -> ");
			decrease(hour, min, sec, time);
		}
	}

}
