package by.krivorot.hw04.task10.logic;

import java.util.ArrayList;
import java.util.List;

import by.krivorot.hw04.task10.emptity.Airline;
import by.krivorot.hw04.task10.emptity.Airport;

public class AirportLogic {

	public List<Airline> findByDestination(Airport airport, String destination) {
		int i;
		List<Airline> airlines = airport.getAirlines();
		List<Airline> findAirlines = new ArrayList<Airline>();

		for (i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getDestination().compareTo(destination) == 0) {
				findAirlines.add(airlines.get(i));
			}

		}
		return findAirlines;
	}

	public List<Airline> findByDays(Airport airport, String day) {
		int i;
		List<Airline> airlines = airport.getAirlines();
		List<Airline> findAirlines = new ArrayList<Airline>();

		for (i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getDays().contains(day)) {
				findAirlines.add(airlines.get(i));
			}

		}
		return findAirlines;
	}

	public List<Airline> findByDaysAndTime(Airport airport, String day, String time) {
		int i;
		List<Airline> airlines = airport.getAirlines();
		List<Airline> findAirlines = new ArrayList<Airline>();

		for (i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getDays().contains(day)) {
				if (airlines.get(i).getDepartureTime().compareTo(time) > 0) {
					findAirlines.add(airlines.get(i));
				}
			}

		}
		return findAirlines;
	}

}
