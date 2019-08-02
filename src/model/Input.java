package model;

import calculator.Calculator;

public class Input {
    public int filingStatus;
    public boolean blind;
    public boolean over65;
    public boolean spouseBlind;
    public boolean spouseOver65;
    public double income;
    public double totalIncome;
    public double taxExemptInterest;
    public double taxableInterest = 0;
    public double qualifiedDividends;
    public double ordinaryDividends = 0;
    public double capitalGain = 0;

    public double incomeAdjustments;
    public double adjustedIncome = 0;
    public double standardDeduction = 0;
    public double taxableIncome = 0;

    public Input(int filingStatus, boolean blind, boolean over65, boolean spouseBlind, boolean spouseOver65, double income, double taxExemptInterest, double qualifiedDividends, double incomeAdjustments) {
        this.filingStatus = filingStatus;
        this.blind = blind;
        this.over65 = over65;
        this.spouseBlind = spouseBlind;
        this.spouseOver65 = spouseOver65;
        this.income = income;
        this.taxExemptInterest = taxExemptInterest;
        this.qualifiedDividends = qualifiedDividends;
        this.incomeAdjustments = incomeAdjustments;

        // Line 6: Calculate Total Income.
        this.totalIncome = this.income + this.taxableInterest + this.ordinaryDividends + this.capitalGain;

        // Line 7b: Calculate Adjusted Gross Income.
        this.adjustedIncome = totalIncome - this.incomeAdjustments;

        // Line 8 - Calculate Standard Deduction.
        Calculator calculator = new Calculator();
        this.standardDeduction = calculator.standardDeduction(this);

        // Line 10: Calculate Taxable Income.
        this.taxableIncome = adjustedIncome - standardDeduction;
        if(taxableIncome < 0) { taxableIncome = 0; }
    }

}
