public class Coupon implements DiscountCalculator{

    private int discount;

    public Coupon(int discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscount(double price) {
        return price - discount;
    }
}
