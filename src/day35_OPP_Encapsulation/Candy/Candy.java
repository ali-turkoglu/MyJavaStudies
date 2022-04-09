package day35_OPP_Encapsulation.Candy;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
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
        if (quantity<=0){
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price<0){
            System.exit(1);
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
}
