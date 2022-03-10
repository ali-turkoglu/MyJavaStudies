package day24_CustomMethod_Return;

public class Return_vs_Exit {

    public static void main(String[] args) {

        nameOfTheMonths(50);    //  return çalışıyor ve sonraki satırlar çalışıyor

        System.out.println("Hello World");

        nameOfTheMonths(5); // System.exit(0) çalışıyor bu şekilde ve sonraki satırlar çalışmıyor.

        System.out.println("Hello World");


    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfTheMonths(int number) {

        String name = "";
        if (number >= 1 && number <= 12) {
            //name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
            System.exit(0);
        } else {
            System.out.println("Invalid");
            return;  // exits nameOfTheMonth
        }
        System.out.println(number + ".month name= " + name);


    }
}
