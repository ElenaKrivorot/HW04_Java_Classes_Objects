package by.krivorot.hw04.task04.view;

import java.util.List;

import by.krivorot.hw04.task04.emptity.Train;

public class DepoView {

	public void printAllTrains(String departure, List<Train> sortTrains) {
		int i;

		System.out.println("In departure " + departure + " trains are:");
		for (i = 0; i < sortTrains.size(); i++) {
			System.out.printf("%6d", sortTrains.get(i).getTrainNumber());
			System.out.printf("%15s", sortTrains.get(i).getDestination());
			System.out.printf("%10s", sortTrains.get(i).getDepartureTime());
			System.out.println();
		}

	}

}
