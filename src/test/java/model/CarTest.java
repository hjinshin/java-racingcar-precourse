package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("SHIN");
    }

    @Test
    @DisplayName("자동차 이동 성공 테스트")
    void moveTest() {
        // given
        int randomNumber = 10;
        Car newCar = car;
        int position = newCar.getPosition();

        // when
        newCar.move(randomNumber);
        int actual = newCar.getPosition();

        // then
        assertThat(actual).isEqualTo(position + 1);
    }

    @Test
    @DisplayName("자동차 이동 실패 테스트")
    void notMoveTest() {
        // given
        int randomNumber = 1;
        Car newCar = car;
        int position = newCar.getPosition();

        // when
        newCar.move(randomNumber);
        int actual = newCar.getPosition();

        // then
        assertThat(actual).isEqualTo(position);
    }
}