package by.krivorot.hw04.task10.view;

import java.util.List;

import by.krivorot.hw04.task10.emptity.Airline;

public class AirportView {
	
	public void printAirlines(List<Airline> airlines) {
		int i;

		System.out.println("Find airlines are:");
		for (i = 0; i < airlines.size(); i++) {
			System.out.println(airlines.get(i).toString());
			
		}
	}

}
