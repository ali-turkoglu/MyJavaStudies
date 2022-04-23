package day43_OOP_Abstraction.car;

public abstract class Car {
    private  final String make,model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        this.model=model;
        this.make=make;
        setColor(color);
        if (year<1886){
            throw new RuntimeException("Invalid Year: "+year);
        }
        this.year=year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }
        this.price = price;
    }

    public abstract void start();
    public abstract void stop();//{ System.out.println("Press the brake");  }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car Task:
	abstract Car:
		make, model, color, year, price....
		start();
		stop()
 */