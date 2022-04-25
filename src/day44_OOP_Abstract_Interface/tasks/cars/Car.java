package day44_OOP_Abstract_Interface.tasks.cars;

public abstract class Car {

    private final String brand,model;
    private final int year;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new RuntimeException("Invalid price: "+ price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        if (year<1886){
            throw new RuntimeException("Invalid year: "+year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println( brand+" is braking");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
