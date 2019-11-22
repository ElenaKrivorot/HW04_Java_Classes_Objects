package by.krivorot.hw04.task08.logic;

import java.util.ArrayList;
import java.util.List;

import by.krivorot.hw04.task08.emptity.Customer;
import by.krivorot.hw04.task08.emptity.CustomerBase;

public class CustomerBaseLogic {

	public List<Customer> sortNameByAlphabet(CustomerBase base) {
		List<Customer> customers = base.getCustomers();
		int i;
		int j;
		Customer temp;

		for (i = 0; i < (customers.size() - 1); i++) {
			for (j = (customers.size() - 1); j > 0; j--) {
				if ((customers.get(j - 1).getSurname().compareTo(customers.get(j).getSurname())) > 0) {
					temp = customers.get(j - 1);
					customers.set(j - 1, customers.get(j));
					customers.set(j, temp);
				}
				if ((customers.get(j - 1).getSurname().compareTo(customers.get(j).getSurname())) == 0) {
					if (customers.get(j - 1).getName().compareTo(customers.get(j).getName()) > 0) {
						temp = customers.get(j - 1);
						customers.set(j - 1, customers.get(j));
						customers.set(j, temp);
					}
				}
			}

		}
		return customers;
	}

	public List<Customer> findByCreditCardNumber(int min, int max, CustomerBase base) {
		List<Customer> customers = base.getCustomers();
		int i;
		List<Customer> findCustomers = new ArrayList<Customer>();

		for (i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCreditCardNumber() <= max && customers.get(i).getCreditCardNumber() >= min) {
				findCustomers.add(customers.get(i));
			}

		}
		return findCustomers;
	}

}
