package by.krivorot.hw04.task06.emtity;

public class Time {

	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public Time() {

	}

	public Time(int hour, int minute, int second) {

		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		if (second >= 0 && second <= 59) {
			this.second = second;
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

}
