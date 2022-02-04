import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class TestCreditCalculator {
    private final int amount = 1_500_000;
    private final int term = 12;
    private final double rate = 10;

    CreditCalculator creditCalculator = new CreditCalculator(amount, term, rate);


    @Test
    @DisplayName("Рассчет месячного платежа")
    void monthlyPayment() {
        int expected = 131_874;
        final int result = creditCalculator.monthlyPayment();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Рассчет общей суммы к возврату в банк")
    void totalAmount() {
        int expected = 1_582_488;
        final int result = creditCalculator.totalAmount();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Рассчет переплаты за весь период")
    void overpayment() {
        int expected = 82_488;
        final int result = creditCalculator.overpayment();
        Assertions.assertEquals(expected, result);
    }

}
