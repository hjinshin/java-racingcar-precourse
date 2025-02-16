import controller.RaceController;
import validator.CountValidator;
import validator.ListSizeValidator;
import validator.NameLengthValidator;
import validator.NumberFormatValidator;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView(new Scanner(System.in),
                new NameLengthValidator(),
                new ListSizeValidator(),
                new NumberFormatValidator(),
                new CountValidator()
        );
        OutputView outputView = new OutputView();
        RaceController raceController = new RaceController(inputView, outputView);

        raceController.exec();
    }
}
