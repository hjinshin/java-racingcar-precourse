package view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import validator.CountValidator;
import validator.ListSizeValidator;
import validator.NameLengthValidator;
import validator.NumberFormatValidator;

import java.util.List;
import java.util.Scanner;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

class InputViewTest {

    @Test
    @DisplayName("자동차 목록 입력 테스트")
    void inputCarListTest() {
        // given
        String input = "a,b,c,d,e";
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn(input);
        InputView inputView = new InputView(mockScanner, new NameLengthValidator(), new ListSizeValidator(), new NumberFormatValidator(), new CountValidator());

        // when
        List<String> actualList = inputView.inputCarList();

        // then
        List<String> expectedList = List.of(input.split(","));
        assertThat(actualList).isEqualTo(expectedList);
    }
}