package calculator;

import model.Input;

public class Calculator {

    public int boxesChecked(Input testCase) {
        int boxesChecked = 0;
        if (testCase.blind == true) { boxesChecked++; }
        if (testCase.over65 == true) { boxesChecked++; }
        if (testCase.spouseBlind == true) { boxesChecked++; }
        if (testCase.spouseOver65 == true) { boxesChecked++; }

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

    public double taxDue(Input testCase) {
        // Define tax brackets.
        int[] singleIncomeBracket = new int[] {0, 9525, 38700, 82500, 157500, 200000, 500000};
        int[] marriedIncomeBracket = new int[] {0, 19050, 77400, 165000, 315000, 400000, 600000};
        double[] taxRate = new double[] {.10, .12, .22, .24, .32, .35, .37};
        double taxDue = 0.0;

        // If single...
        if(testCase.filingStatus == 1)
        {
            for (int i = 0; testCase.taxableIncome > singleIncomeBracket[i]; i++)
            {
                // Define local variables.
                double taxSegment = 0.0;
                int thisBracketBottom = singleIncomeBracket[i];
                int thisBracketTop = singleIncomeBracket[i+1];

                // Apply this bracket's tax rate on any amount exceeding the previous tax bracket.
                if(testCase.taxableIncome > thisBracketTop)
                    taxSegment = (thisBracketTop - thisBracketBottom) *  taxRate[i];
                else
                    taxSegment = (testCase.taxableIncome - thisBracketBottom) * taxRate[i];

                // Add the tax for each bracket to the total tax due.
                taxDue += taxSegment;
            }
        }
        // If married...
        else
        {
            for (int i = 0; testCase.taxableIncome > marriedIncomeBracket[i]; i++)
            {
                // Define local variables.
                double taxSegment = 0.0;
                int thisBracketBottom = marriedIncomeBracket[i];
                int thisBracketTop = marriedIncomeBracket[i+1];

                // Apply this bracket's tax rate on any amount exceeding the previous tax bracket.
                if(testCase.taxableIncome > thisBracketTop)
                    taxSegment = (thisBracketTop - thisBracketBottom) *  taxRate[i];
                else
                    taxSegment = (testCase.taxableIncome - thisBracketBottom) * taxRate[i];

                // Add the tax for each bracket to the total tax due.
                taxDue += taxSegment;
            }
        }

        return taxDue;
    }
}
