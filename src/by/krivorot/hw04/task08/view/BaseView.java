package by.krivorot.hw04.task08.view;

import java.util.List;

import by.krivorot.hw04.task08.emptity.Customer;



public class BaseView {
	
	public void printCustomersList(String baseName, String mes, List<Customer> customers) {
		int i;

		System.out.println("In base " + baseName + mes);
		for (i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i).toString());
			
		}

	}

}
