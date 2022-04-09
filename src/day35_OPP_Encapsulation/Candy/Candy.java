package day35_OPP_Encapsulation.Candy;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            return;
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
          return;
        }

        this.price = price;
    }


    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public double calcCost() {
        return quantity * price;
    }

    public String toString() {

        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", unit price=$" + ((price==0.0)?"free":price) +
                ", total price=" + ((calcCost() == 0) ? "free" : '$' + price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
