package dao;

public class Budget {
    private String currency;
    private double maxAmount;

    public Budget(String currency, double maxAmount) {
        this.currency = currency;
        this.maxAmount = maxAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }
}
