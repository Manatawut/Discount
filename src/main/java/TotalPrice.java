import java.util.ArrayList;

public class TotalPrice {
    public static double TotalPrice(ArrayList<DiscountCalculator> discountCal, double price) {
        double totalPrice = price;
        for (DiscountCalculator item: discountCal) {
            totalPrice = item.getDiscount(totalPrice);
        }
        return totalPrice;
    }
}
