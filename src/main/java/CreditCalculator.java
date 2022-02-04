public class CreditCalculator {
    private int amount;
    private int term;
    private double rate;

    public CreditCalculator(int amount, int term, double rate) {
        this.amount = amount;
        this.term = term;
        this.rate = rate;
    }

    public int monthlyPayment() {
        return 0;
    }

    public int totalAmount() {
        return 0;
    }

    public int overpayment() {
        return 0;
    }
}
