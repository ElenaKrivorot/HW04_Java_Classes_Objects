package by.krivorot.hw04.task08.emptity;

public class Customer {
	private int id;
	private String name;
	private String patronymic;
	private String surname;	
	private String address;
	private int creditCardNumber;
	private String bankAccountNumber;

	public Customer(int id, String name, String patronymic, String surname, String address, int creditCardNumber,
			String bankAccountNumber) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bankAccountNumber == null) ? 0 : bankAccountNumber.hashCode());
		result = prime * result + creditCardNumber;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber == null) {
			if (other.bankAccountNumber != null)
				return false;
		} else if (!bankAccountNumber.equals(other.bankAccountNumber))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", patronymic=" + patronymic + ", surname=" + surname
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}
	
	

}
