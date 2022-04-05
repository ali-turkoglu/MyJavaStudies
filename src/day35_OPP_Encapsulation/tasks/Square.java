package day35_OPP_Encapsulation.tasks;

public class Square {

    private int side;

    public Square(int side){
        setSide(side);
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        if (side<0){
            System.err.println("Invalid Entry: "+ side);
            return;
        }
        this.side=side;
    }

    public int calcArea(){
        return side*side;
    }

    public int calcPerimeter(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
/*Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement


 */