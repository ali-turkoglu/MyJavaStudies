package day23_CustomMethods_Void.tasks;

public class PrintEachChar {

    public static void main(String[] args) {

        String str= "Wooden Spoon";

        printEachChar(str);

    }

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
/*create a method named printEachChar that can print each characters of a string

 */