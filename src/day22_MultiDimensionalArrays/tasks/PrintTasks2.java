package day22_MultiDimensionalArrays.tasks;

import java.util.Arrays;

public class PrintTasks2 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

        for (String[] each : items) {
            for (String each2 : each) {
                System.out.print(each2+"\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------2------------------------------------------");


        for (String[] each : items) {
            //String [] temp=new String[each.length-1];

            for (int i = 0; i < each.length/2; i++) {
                String temp=each[i];
                each[i]=each[(each.length-1)-i];
                each[(each.length-1)-i]=temp;

            }
            System.out.println(Arrays.toString(each));
        }

        System.out.println("----------------------------------------3------------------------------------------");

        String[][] items2 = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

        String[][] result =new String[items2.length][];
        for (int i = 0; i < items2.length; i++) {
            result[(result.length-1)-i]=items2[i];
        }
        for (String[] each1D : result) {
            System.out.println(Arrays.toString(each1D));
        }

    }
}
/*Given the Array:


		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado


 */