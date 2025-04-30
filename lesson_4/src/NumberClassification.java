public class NumberClassification {
    private final int number;

    public NumberClassification(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isZero() {
        return number == 0;
    }

    public String getParity() {
        return isEven() ? "Even" : "Odd";
    }

    public String getSign() {
        if (isZero()) {
            return "Zero";
        }
        return isPositive() ? "Positive" : "Negative";
    }

    public String getFullClassification() {

        if (isZero()) {
            return "The number is zero";
        }

        return String.format("The number is %s and %s", getSign(), getParity());
    }
}
