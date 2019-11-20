package by.krivorot.hw04.task05.main;

import by.krivorot.hw04.task05.emptity.Counter;
import by.krivorot.hw04.task05.logic.CounterLogic;
import by.krivorot.hw04.task05.view.CounterView;

public class Main {

	public static void main(String[] args) {

		Counter counter1 = new Counter();
		Counter counter2 = new Counter(10, 100, 99);

		CounterView view = new CounterView();
		view.printCurrentState("counter1", counter1);
		view.printCurrentState("counter2", counter2);
		
		CounterLogic changeCurrent = new CounterLogic();
		changeCurrent.increase(counter2);
		view.printCurrentState("counter2", counter2);
		changeCurrent.increase(counter2);
		view.printCurrentState("counter2", counter2);
		
		changeCurrent.decrease(counter1);
		view.printCurrentState("counter1", counter1);

	}

}
