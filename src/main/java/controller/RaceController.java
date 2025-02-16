package controller;

import model.Car;
import model.Race;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RaceController {
    private final InputView inputView;
    private final OutputView outputView;

    public RaceController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void exec() {
        List<String> nameList = inputView.inputCarList();
        int raceCount = inputView.inputRacingCount();

        Race race = new Race(nameList);
        startRace(race, raceCount);

        outputView.printWinner(race.getRaceWinner());
    }

    public void startRace(Race race, int raceCount) {
        outputView.printRaceStart();
        for(int i = 0; i < raceCount; i++) {
            race.run();
            printProgress(race);
        }
    }

    public void printProgress(Race race) {
        for (Car car : race.getCarList()) {
            outputView.printCar(car);
        }
        System.out.println();
    }
}
