package by.krivorot.hw04.task01.main;

import by.krivorot.hw04.task01.emptity.Test1;
import by.krivorot.hw04.task01.logic.Test1Logic;
import by.krivorot.hw04.task01.view.ViewTest1;

public class Main {

	public static void main(String[] args) {
		
		Test1 test = new Test1();
		test.setA(5);
		test.setB(8);
		
		Test1Logic logic = new Test1Logic();		
		ViewTest1 view = new ViewTest1();
		
		view.printValue("Sum", logic.add(test));
		view.printValue("Max", logic.findMax(test));
		
	}

}
