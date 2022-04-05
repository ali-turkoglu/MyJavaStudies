package day35_OPP_Encapsulation.tasks;

public class $Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Invalid Entry: " + name);
            return;
        }
        char[] ch = name.toCharArray();
        for (char each : ch) {
            if (!(each<='z'&&each>='a'&&each==' '&& each>=0&&each<=9 || each<='Z'&&each>='A'&&each==' ')) {
                System.err.println("Invalid Entry: test " + name);
                return;
            }
        }
        if (!(Character.isLetter(ch[0]))) {
            System.err.println("Invalid Entry: " + name);
            return;
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid Entry: " + unitPrice);
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Invalid Entry: " + quantity);
            return;
        }

       if (name.equals("toilet paper") && quantity != 1) {
            //System.err.println("Invalid Entry: " + quantity);
            //return;
            System.out.println("ok");
        }
        this.quantity = quantity;
    }

    public $Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        //setQuantity(quantity);
    }

    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
/*
create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()


 */