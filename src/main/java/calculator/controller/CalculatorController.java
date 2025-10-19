package calculator.controller;

import calculator.domain.Separator;
import calculator.domain.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final Separator separator = new Separator();
    private final StringCalculator stringCalculator = new StringCalculator();

    public void run() {
        String expression = inputView.getExpression();
        String[] numbers = separator.split(expression);
        int result = stringCalculator.sum(numbers);
        outputView.printResult(result);
    }
}
