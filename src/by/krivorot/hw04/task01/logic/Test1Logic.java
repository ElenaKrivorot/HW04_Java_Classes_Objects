package by.krivorot.hw04.task01.logic;

import by.krivorot.hw04.task01.emptity.Test1;

public class Test1Logic {

	public int add(Test1 test) {
		int s;

		s = test.getA() + test.getB();
		return s;
	}

	public int findMax(Test1 test) {
		int max;

		max = Math.max(test.getA(), test.getB());
		return max;
	}

}
