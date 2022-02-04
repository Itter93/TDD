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
        double monthRate = rate * 0.01 / 12;
        double annuityRate = (monthRate * Math.pow(1 + monthRate, term)) / ((Math.pow(1 + monthRate, term)) - 1);
        return (int) Math.round(annuityRate * amount);
    }

    public int totalAmount() {
        return monthlyPayment() * term;
    }

    public int overpayment() {
        return totalAmount() - amount;
    }
}
