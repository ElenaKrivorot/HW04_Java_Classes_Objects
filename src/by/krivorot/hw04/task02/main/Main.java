package by.krivorot.hw04.task02.main;

import by.krivorot.hw04.task02.emptity.Test2;
import by.krivorot.hw04.task02.view.ViewTest2;

public class Main {

	public static void main(String[] args) {

		Test2 test1 = new Test2();

		Test2 test2 = new Test2(9, 7);

		ViewTest2 view = new ViewTest2();

		view.printTest2(test1);
		view.printTest2(test2);

	}

}
