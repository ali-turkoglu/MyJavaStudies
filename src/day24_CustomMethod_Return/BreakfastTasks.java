package day24_CustomMethod_Return;

public class BreakfastTasks {


    public static void main(String[] args) {

        initialsPerson("ali", "turkoglu");

        System.out.println("---------------------------------------1------------------------");

        domain("Cydeo@gmail.com");

        System.out.println("---------------------------------------2------------------------");

        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "Elminur@cydeo.com", "gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("----------------------------------------3------------------------");

        //nameOfTheMonths(5);

        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int month : months) {
            nameOfTheMonths(month);

        }
        System.out.println("----------------------------------------4-------------------------");

        //nameOfTheDays(5);
        int[] days = {1, 2, 3, 4, 5, 6, 7};
        for (int day : days) {
            nameOfTheDays(day);
        }

        System.out.println("-----------------------------------------5----------------------------");

        daysInMonth(7);

        System.out.println("------------------------------------------6----------------------------");

        ageGroups(54);


    }

    // 1. Create a method that can display the initials of the person
    public static void initialsPerson(String firstName, String lastName) {

        String initialsPerson = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);
        System.out.println("initialsPerson = " + initialsPerson);
    }


    // 2. Create a method that can display the domain of the email
    public static void domain(String email) {

        String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));
        System.out.println("domain = " + domain);


    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfTheMonths(int number) {

        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            System.out.println("Invalid");
        }
        System.out.println(number + ".month name= " + name);


    }


    // 4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDays(int number) {
        String name = "";
        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            name = "Invalid";
        }
        System.out.println(number + ".day is " + name);
    }


    // 5. Create a method that can print how many days a month has
    public static void daysInMonth(int number) {

        boolean days28 = number == 2;
        boolean days30 = number == 4 || number == 6 || number == 9 || number == 11;
        boolean days31 = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;


        if (days28) {
            System.out.println(number + ". month has 28 days.");
        }
        if (days30) {
            System.out.println(number + ". month has 30 days.");
        }
        if (days31) {
            System.out.println(number + ". month has 31 days.");
        }

    }


    // 6. ageGroups
    public static void ageGroups(int age) {

        if (age >= 0 && age < 120) {
            if (age >= 0 && age <= 2) {
                System.out.println("Infant");
            } else if (age >= 3 && age <= 5) {
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) {
                System.out.println("Kid");
            } else if (age >= 10 && age <= 12) {
                System.out.println("Pre-Teen");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager");
            } else if (age >= 18 && age <= 20) {
                System.out.println("Young Adult");
            } else if (age >= 21 && age <= 39) {
                System.out.println("Adult");
            } else if (age >= 40 && age <= 49) {
                System.out.println("Young Middle Age-Aged Adult");
            } else if (age >= 50 && age <= 54) {
                System.out.println("Middle-Aged Adult");
            } else if (age >= 55 && age <= 64) {
                System.out.println("Very Young Senior Citizen");
            } else if (age >= 65 && age <= 74) {
                System.out.println("Young Senior Citizen");
            } else if (age >= 75 && age <= 84) {
                System.out.println("Senior Citizen");
            } else {
                System.out.println("Old Senior Citizen");
            }
        } else {
            System.out.println("Invalid age");
        }
    }

}
/*1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has


 */