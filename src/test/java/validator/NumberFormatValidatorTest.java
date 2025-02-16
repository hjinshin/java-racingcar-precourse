package validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFormatValidatorTest {
     private NumberFormatValidator numberFormatValidator;

     @BeforeEach
    void setUp() {
         numberFormatValidator = new NumberFormatValidator();
     }

     @Test
    @DisplayName("레이싱 횟수가 숫자가 아닐 경우 에러 테스트")
    void validateNumberError() {
         // given
         String input = "String input";
         NumberFormatValidator validator = numberFormatValidator;

         // when then
         assertThrows(IllegalArgumentException.class, () -> validator.validate(input));
     }

}