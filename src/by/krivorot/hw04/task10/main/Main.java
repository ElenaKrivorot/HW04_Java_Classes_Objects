package by.krivorot.hw04.task10.main;

import by.krivorot.hw04.task10.emptity.Airline;
import by.krivorot.hw04.task10.emptity.Airport;
import by.krivorot.hw04.task10.logic.AirportLogic;
import by.krivorot.hw04.task10.view.AirportView;

public class Main {

	public static void main(String[] args) {
		
		Airport airport = new Airport("Minsk");
		airport.setAirlines(new Airline("Moscow", 555, "passenger", "13.30", "Monday, Tuesday, Wednesday, Thursday, Friday, Suturday, Sunday"));
		airport.setAirlines(new Airline("Moscow", 125, "passenger", "16.15", "Monday, Tuesday, Thursday, Friday, Suturday, Sunday"));
		airport.setAirlines(new Airline("Borispol", 147, "passenger", "09.10", "Monday, Tuesday, Wednesday, Thursday, Friday, Suturday, Sunday"));
		airport.setAirlines(new Airline("Borispol", 487, "passenger", "13.50", "Suturday, Sunday"));
		airport.setAirlines(new Airline("Moscow", 265, "passenger", "08.30", "Suturday, Sunday"));
		
		AirportLogic logic = new AirportLogic();
		
		AirportView view = new AirportView();
		view.printAirlines(logic.findByDestination(airport, "Moscow"));
		view.printAirlines(logic.findByDays(airport, "Mon"));
		view.printAirlines(logic.findByDaysAndTime(airport, "Sun", "13.00"));
		
	}

}
