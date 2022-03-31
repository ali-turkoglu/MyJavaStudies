package day31_CustomClass_Constructor;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberofCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberofCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calcCost(){
        double startingPrice;
        if (size=='S'){
             startingPrice=10;
        }else if(size=='M'){
             startingPrice=12;
        }else{
             startingPrice=14;
        }
        double totalPrice= startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }


}
/*Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */

