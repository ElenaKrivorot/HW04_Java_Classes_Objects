package by.krivorot.hw04.task10.emptity;

import java.util.ArrayList;
import java.util.List;

public class Airport {
	private String name;
	private List<Airline> airlines;

	public Airport(String name) {
		this.name = name;
		airlines = new ArrayList<Airline>();
	}

	public Airport(String name, List<Airline> airlines) {
		this.name = name;
		this.airlines = airlines;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public Airline getAirlines(int index) {
		return airlines.get(index);
	}

	public void setAirlines(Airline airline) {
		this.airlines.add(airline);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Airport other = (Airport) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Airport [name=" + name + ", airlines=" + airlines + "]";
	}
	
	

}
