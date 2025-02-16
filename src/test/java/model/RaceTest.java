package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RaceTest {
    private Race race;

    @BeforeEach
    void setUp() {
        List<String> nameList = List.of("A", "B", "C");
        race = new Race(nameList);
    }

    @Test
    @DisplayName("우승자 선정 테스트")
    void getRaceWinnerTest() {
        // given
        Race newRace = race;
        List<Car> carList = newRace.getCarList();
        carList.get(0).move(10);
        carList.get(0).move(10);
        carList.get(2).move(10);
        carList.get(2).move(10);

        // when
        List<String> actualList = newRace.getRaceWinner();

        // then
        assertAll(
                () -> assertThat(actualList).hasSize(2),
                () -> assertThat(actualList.get(0)).isEqualTo(carList.get(0).getName()),
                () -> assertThat(actualList.get(1)).isEqualTo(carList.get(2).getName())
        );
    }
}