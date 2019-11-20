package by.krivorot.hw04.task05.view;

import by.krivorot.hw04.task05.emptity.Counter;

public class CounterView {

	public void printCurrentState(String mes, Counter counter) {
		System.out.println("Current state of " + mes + " : " + counter.getCurrentState());
	}

}
