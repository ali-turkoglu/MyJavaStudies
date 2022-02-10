package week04;

import java.util.Scanner;

public class VendingNestedIf {
    public static void main(String[] args) {

        System.out.println("Select One Of Them: drink / snack");
        Scanner input=new Scanner(System.in);
        String selection=input.next();

        if (selection.equals("drink")) {
            System.out.println("Select Your Drinking: tea / coke");
            String drinkItem=input.next();
            if (drinkItem.equals("tea")){
                System.out.println("You want to drink tea");
            }else{
                System.out.println("You want to drink coke");
            }
        }else{
            System.out.println("Select Your Chose: chips / candy");
            String snackItem=input.next();
            if (snackItem.equals("chips")){
                System.out.println("You want to eat chips");
            }else{
                System.out.println("You want to taste candy");
            }
        }
    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */