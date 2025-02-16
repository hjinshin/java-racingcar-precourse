package model;

import util.RandomUtil;

import java.util.List;

public class Race {
    private final List<Car> carList;

    public Race(List<String> nameList) {
        this.carList = nameList.stream()
                .map(Car::new)
                .toList();
    }

    public void run() {
        for (Car car : carList) {
            car.move(RandomUtil.generateRandomNumber());
        }
    }

    public List<String> getRaceWinner() {
        int max = carList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return carList.stream()
                .filter(car -> car.getPosition() == max)
                .map(Car::getName)
                .toList();
    }

    public List<Car> getCarList() {
        return carList;
    }
}
