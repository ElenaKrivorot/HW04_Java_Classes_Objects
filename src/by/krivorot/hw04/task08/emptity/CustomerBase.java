package by.krivorot.hw04.task08.emptity;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase {
	private List<Customer> customers;
	private String baseName;	
	
	public CustomerBase() {

	}

	public CustomerBase(String baseName) {
		this.baseName = baseName;	
		this.customers = new ArrayList<Customer>();
	}	
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	
	public void setCustomers(Customer customer) {		
			customers.add(customer);
			
	}

	public Customer getCustomers(int index) {
		return customers.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baseName == null) ? 0 : baseName.hashCode());
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
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
		CustomerBase other = (CustomerBase) obj;
		if (baseName == null) {
			if (other.baseName != null)
				return false;
		} else if (!baseName.equals(other.baseName))
			return false;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}	

}
