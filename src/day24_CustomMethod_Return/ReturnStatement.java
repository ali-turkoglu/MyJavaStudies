package day24_CustomMethod_Return;

public class ReturnStatement {


    public static void main(String[] args) {


        nameOfTheDays(10);

        nameOfTheDays(5);
    }


    public static void nameOfTheDays(int number) {
        String name = "";
        if (number > 7 || number < 1) {
            System.out.println(number+". day i Invalid");
            return; // exits nameOfTheDay method
        }

        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            name = "Invalid";
        }
        System.out.println(number + ".day is " + name);
    }


}
