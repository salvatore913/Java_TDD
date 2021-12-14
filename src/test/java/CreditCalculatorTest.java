import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {
    private final int creditAmount = 1_000_000;
    private final double interestRate = 10.9;
    private final int creditTerm = 12;
    CreditCalculator calculator = new CreditCalculator();

    @DisplayName("Проверка расчета расчета месячного платежа")
    @Test
    void testCalcPayPerMonth() {
        int expected = 88_335;
        int actual = calculator.calcPayPerMonth(creditAmount, interestRate, creditTerm);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Проверка расчета общей суммы к возврату в банк")
    @Test
    void testCalcTheTotalAmount() {
        int expected = 1_060_020;
        int actual = calculator.calcTheTotalAmount(creditAmount, interestRate, creditTerm);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Проверка расчет переплаты за весь период")
    @Test
    void testCalcOverpayAmount() {
        int expected = 60_020;
        int actual = calculator.calcOverpayAmount(creditAmount, interestRate, creditTerm);
        Assertions.assertEquals(expected, actual);
    }
}