package model;

public class Input {
    int filingStatus;
    boolean blind;
    boolean over65;
    boolean spouseBlind;
    boolean spouseOver65;
    double income;
    double taxExemptInterest;
    double taxableInterest = 0;
    double qualifiedDividends;
    double ordinaryDividends = 0;
    double capitalGain = 0;

    double incomeAdjustments;
    double adjustedIncome = 0;
    double standardDeduction = 0;
    double taxableIncome = 0;

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
    }

}
