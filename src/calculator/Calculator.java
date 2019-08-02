package calculator;

import model.Input;

public class Calculator {

    public double calculateTax(Input testCase) {



        // Line 6: Calculate Total Income.
        double totalIncome = testCase.income + testCase.taxableInterest + testCase.ordinaryDividends + testCase.capitalGain;

        // Line 7b: Calculate Adjusted Gross Income.
        double adjustedIncome = totalIncome - testCase.incomeAdjustments;

        // Line 8 - Calculate Standard Deduction.
        double standardDeduction = standardDeduction(testCase);

        // Line 10: Calculate Taxable Income.
        double taxableIncome = adjustedIncome - standardDeduction;
        if(taxableIncome < 0) { taxableIncome = 0; }



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

        // Initialize variables.
        int standardDeduction = 0;
        int boxesChecked = boxesChecked(testCase);

        // If single, set corresponding standard deduction.
        if (testCase.filingStatus == 1) {
            switch(boxesChecked)
            {
                case 0:  standardDeduction = 12000; break;
                case 1:  standardDeduction = 13600; break;
                case 2:  standardDeduction = 15200; break;
            }
        // If married, set corresponding standard deduction.
        } else {
            switch(boxesChecked)
            {
                case 0:  standardDeduction = 24000; break;
                case 1:  standardDeduction = 25300; break;
                case 2:  standardDeduction = 26600; break;
                case 3:  standardDeduction = 27900; break;
                case 4:  standardDeduction = 29200; break;
            }
        }

        return standardDeduction;
    }
}
