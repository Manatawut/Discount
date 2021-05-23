import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<DiscountCalculator> discountList = new ArrayList<DiscountCalculator>();
        Coupon d1 = new Coupon(150);
        Coupon d2 = new Coupon(50);
        Percent d3 = new Percent(10);
        Condition d4 = new Condition(3000, 300);
        discountList.add(d1);
        discountList.add(d2);
        discountList.add(d3);
        discountList.add(d4);
        double n =  TotalPrice.TotalPrice(discountList, 5000);
        System.out.println(n);
    }
}
