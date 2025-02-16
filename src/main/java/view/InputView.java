package view;

import validator.CountValidator;
import validator.ListSizeValidator;
import validator.NameLengthValidator;
import validator.NumberFormatValidator;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_CARLIST_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_RACING_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private final Scanner scanner;
    private final NameLengthValidator nameLengthValidator;
    private final ListSizeValidator listSizeValidator;
    private final NumberFormatValidator numberFormatValidator;
    private final CountValidator countValidator;

    public InputView(Scanner scanner, NameLengthValidator nameLengthValidator, ListSizeValidator listSizeValidator, NumberFormatValidator numberFormatValidator, CountValidator countValidator) {
        this.scanner = scanner;
        this.nameLengthValidator = nameLengthValidator;
        this.listSizeValidator = listSizeValidator;
        this.numberFormatValidator = numberFormatValidator;
        this.countValidator = countValidator;
    }


    public List<String> inputCarList() {
        System.out.println(INPUT_CARLIST_MESSAGE);
        String input = scanner.nextLine();
        List<String> list = List.of(input.split(","));
        listSizeValidator.validate(list);
        nameLengthValidator.validate(list);
        return list;
    }

    public int inputRacingCount() {
        System.out.println(INPUT_RACING_COUNT_MESSAGE);
        String input = scanner.nextLine();
        numberFormatValidator.validate(input);
        countValidator.validate(input);
        return Integer.parseInt(input);
    }
}