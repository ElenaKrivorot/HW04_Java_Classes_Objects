package by.krivorot.hw04.task04.logic;

import java.util.List;

import by.krivorot.hw04.task04.emptity.Depo;
import by.krivorot.hw04.task04.emptity.Train;

public class DepoLogic {

	public List<Train> sortByNumber(Depo depo) {
		List<Train> trains = depo.getTrains();
		int i;
		int j;
		Train temp;

		for (i = 0; i < (trains.size() - 1); i++) {
			for (j = (trains.size() - 1); j > 0; j--) {
				if (trains.get(j - 1).getTrainNumber() > trains.get(j).getTrainNumber()) {
					temp = trains.get(j - 1);
					trains.set(j - 1, trains.get(j));
					trains.set(j, temp);
				}
			}

		}
		return trains;
	}

	public Train findByNumber(int number, Depo depo) {
		List<Train> trains = depo.getTrains();
		int i;
		Train findtrain = new Train();

		for (i = 0; i < trains.size(); i++) {
			if (trains.get(i).getTrainNumber() == number) {
				findtrain = trains.get(i);
				break;
			}

		}
		return findtrain;
	}

	public List<Train> sortByDestination(Depo depo) {
		List<Train> trains = depo.getTrains();
		int i;
		int j;
		Train temp;

		for (i = 0; i < (trains.size() - 1); i++) {
			for (j = (trains.size() - 1); j > 0; j--) {
				if ((trains.get(j - 1).getDestination().compareTo(trains.get(j).getDestination())) > 0) {
					temp = trains.get(j - 1);
					trains.set(j - 1, trains.get(j));
					trains.set(j, temp);
				}
				if ((trains.get(j - 1).getDestination().compareTo(trains.get(j).getDestination())) == 0) {					
					if (trains.get(j - 1).getDepartureTime().compareTo(trains.get(j).getDepartureTime()) > 0) {
					temp = trains.get(j - 1);
					trains.set(j - 1, trains.get(j));
					trains.set(j, temp);
					}
				}
			}

		}
		return trains;
	}
}
