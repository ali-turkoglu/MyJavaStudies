package week07;

import java.util.Scanner;

public class ShoppingList2ReplitTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.nextLine().toLowerCase();
            price=scan.nextDouble();
            shoppingListReport+="Item"+count+": "+item+" Price: "+price+",";
            count++;
            totalPrice+=price;
            System.out.println("Add one more item?");
            scan.nextLine(); // enter i boşa almak için, alt satırdaki
            countinue=scan.nextLine();

        }while (countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport);
        System.out.println("Total Price= "+totalPrice);

    }
}
