package by.krivorot.hw04.task04.main;

import java.util.List;

import by.krivorot.hw04.task04.emptity.Depo;
import by.krivorot.hw04.task04.emptity.Train;
import by.krivorot.hw04.task04.input.TrainInput;
import by.krivorot.hw04.task04.logic.DepoLogic;
import by.krivorot.hw04.task04.view.DepoView;
import by.krivorot.hw04.task04.view.TrainView;

public class Main {

	public static void main(String[] args) {

		Depo depo = new Depo("Minsk");
		depo.setTrains(new Train("Vitebsk", 125, "16.40"));
		depo.setTrains(new Train("Brest", 555, "17.30"));
		depo.setTrains(new Train("Osipovichy", 129, "17.00"));
		depo.setTrains(new Train("Homel", 231, "13.25"));
		depo.setTrains(new Train("Vitebsk", 120, "12.25"));

		DepoLogic depoLogik = new DepoLogic();
		List<Train> sortNumber = depoLogik.sortByNumber(depo);
		DepoView view = new DepoView();
		view.printAllTrains(depo.getDeparture(), sortNumber);

		TrainInput trnumber = new TrainInput();
		Train findTrain = depoLogik.findByNumber(trnumber.inputTrainNumber(), depo);
		TrainView trview = new TrainView();
		trview.printTrain(findTrain);
		
		List<Train> sortDestination = depoLogik.sortByDestination(depo);
		view.printAllTrains(depo.getDeparture(), sortDestination);

	}

}
