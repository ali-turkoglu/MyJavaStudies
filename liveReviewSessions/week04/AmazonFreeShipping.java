package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice = 55;

        if (totalPrice >= 25) {
            System.out.println("Free Shipping Eligible. Your order total: " + totalPrice);
        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + ". less than minimum of $25");
        }
        System.out.println("Thanks for shopping with us!");
    }
}
