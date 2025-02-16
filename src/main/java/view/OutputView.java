package view;

import model.Car;

import java.util.List;

public class OutputView {
    private static final String PROGRESS_MESSAGE = "-";
    private static final String START_RACE_MESSAGE = "실행결과";
    private static final String WINNER_MESSAGE = "최종우승자";

    public void printCar(Car car) {
        System.out.println(car.getName() + " : " + PROGRESS_MESSAGE.repeat(car.getPosition()));
    }

    public void printRaceStart() {
        System.out.println(START_RACE_MESSAGE);
    }

    public void printWinner(List<String> winnerList) {
        System.out.println(WINNER_MESSAGE + " : " + String.join(", ", winnerList));
    }
}
