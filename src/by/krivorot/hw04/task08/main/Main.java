package by.krivorot.hw04.task08.main;

import by.krivorot.hw04.task08.emptity.Customer;
import by.krivorot.hw04.task08.emptity.CustomerBase;
import by.krivorot.hw04.task08.logic.CustomerBaseLogic;
import by.krivorot.hw04.task08.view.BaseView;

public class Main {

	public static void main(String[] args) {

		CustomerBase base = new CustomerBase("Store A");
		base.setCustomers(new Customer(1, "Ivan", "Ivanovich", "Ivanov", "Brest", 1234, "BY1234ALFA1234"));
		base.setCustomers(new Customer(2, "Ivan", "Petrovich", "Petrov", "Minsk", 5555, "BY5555ALFA1236"));
		base.setCustomers(new Customer(3, "Petr", "Ivanovich", "Sidorov", "Homel", 3256, "BY5555ALFA1265"));
		base.setCustomers(new Customer(4, "Ivan", "Sidorovich", "Trus", "Minsk", 2598, "BY2654ALFA6985"));
		base.setCustomers(new Customer(5, "Aleksey", "Alekseevich", "Alioshkin", "Hrodno", 9845, "BY2598ALFA4589"));

		CustomerBaseLogic logic = new CustomerBaseLogic();

		BaseView print = new BaseView();
		print.printCustomersList(base.getBaseName(), " customers are:", logic.sortNameByAlphabet(base));
		print.printCustomersList(base.getBaseName(), " on request were find following customers: ", logic.findByCreditCardNumber(1000, 4000, base));

	}

}
