package by.krivorot.hw04.task04.view;

import by.krivorot.hw04.task04.emptity.Train;

public class TrainView {

	public void printTrain(Train train) {

		System.out.printf("%6d", train.getTrainNumber());
		System.out.printf("%15s", train.getDestination());
		System.out.printf("%10s", train.getDepartureTime());
		System.out.println();

	}

}
