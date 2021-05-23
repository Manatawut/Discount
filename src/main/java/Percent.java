public class Percent implements DiscountCalculator{

    private int percent;

    public Percent(int percent) {
        this.percent = percent;
    }

    @Override
    public double getDiscount(double price) {
        return price - ((price * percent) / 100);
    }
}
