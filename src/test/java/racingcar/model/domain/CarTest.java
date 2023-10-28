package racingcar.model.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("자동차 객체 생성을 테스트 합니다.")
    void 자동차_객체_생성() {
        Car car = Car.from("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
    }
}