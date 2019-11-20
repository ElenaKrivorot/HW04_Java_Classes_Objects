package by.krivorot.hw04.task05.logic;

import by.krivorot.hw04.task05.emptity.Counter;

public class CounterLogic {

	public void increase(Counter counter) {
		if (counter.getCurrentState() < counter.getMax()) {
			counter.setCurrentState(counter.getCurrentState() + 1);
		} else {
			counter.setCurrentState(counter.getMin());
		}
	}

	public void decrease(Counter counter) {
		if (counter.getCurrentState() > counter.getMin()) {
			counter.setCurrentState(counter.getCurrentState() - 1);
		} else {
			counter.setCurrentState(counter.getMax());
		}
	}

}
