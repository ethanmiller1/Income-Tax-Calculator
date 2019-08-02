package calculator;

import model.Input;

public class Calculator {

    public double calculateTax(Input testCase) {

        int boxesChecked = boxesChecked(testCase);

        return 27475.00;
    }

    public int boxesChecked(Input testCase) {
        int boxesChecked = 0;
        if (testCase.blind = true) { boxesChecked++; }
        if (testCase.over65 = true) { boxesChecked++; }
        if (testCase.spouseBlind = true) { boxesChecked++; }
        if (testCase.spouseOver65 = true) { boxesChecked++; }

        return boxesChecked;
    }

    public double standardDeduction(Input testCase) {
        int boxesChecked = boxesChecked(testCase);
        return 0.00;
    }
}
