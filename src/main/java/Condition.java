public class Condition implements DiscountCalculator{

    private double conditionPrice;
    private double discount;

    public Condition(double conditionPrice, double discount) {
        this.conditionPrice = conditionPrice;
        this.discount = discount;
    }

    @Override
    public double getDiscount(double price) {
        if (price >= conditionPrice)
            return price - discount;
        return price;
    }
}
