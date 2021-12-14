public class CreditCalculator {
    public int calcPayPerMonth(int creditAmount, double interestRate, int creditTerm) {
        return 0;
    }

    public int calcTheTotalAmount(int creditAmount, double interestRate, int creditTerm) {
        return 0;
    }

    public int calcOverpayAmount(int creditAmount, double interestRate, int creditTerm) {
        return 0;
    }

    public static void main(String[] args) {
        int creditAmount = 1_000_000;
        double interestRate = 10.9;
        int creditTerm = 12;
        CreditCalculator calculator = new CreditCalculator();
        System.out.println("Ежемесячный платеж равен " + calculator.calcPayPerMonth(creditAmount, interestRate, creditTerm));
        System.out.println("Общая сумма к возврату в банк равна " + calculator.calcTheTotalAmount(creditAmount, interestRate, creditTerm));
        System.out.println("Переплата за весь период равна " + calculator.calcOverpayAmount(creditAmount, interestRate, creditTerm));
    }
}