package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

      // && "AND" Operator : both expression must be true for true output

        String name = "Steve";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen== "USA";

        System.out.println(name + " is eligible to vote : " + isEligible);

        System.out.println("----------------------------------------");

        String name2 = "John";
        int creditScore = 720;
        int age2 = 23;
        int inCome = 5500;

        boolean isEligible2 = age2 >= 18 && creditScore >= 450 && inCome >= 1500;
        System.out.println(name2 + " is eligible for loan: "+ isEligible2);

        System.out.println("----------------------------------");

    // || "OR" Operator : only one true expression is enough for true output

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3>= 18 && (gender =='M' || gender== 'F');

        //                      true     && (    false    ||    true    )
        //                      true     &&             true
        //                                  true

        System.out.println(name3 + " is eligible to register: "+ isEligible3);

        System.out.println("--------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 =  gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student+ " is eligible: "+ isEligible5);

        System.out.println("---------------------------------");
        //  ! NOT Operator :

        boolean result11 = true;

        System.out.println(!result11);

        System.out.println("--------------------------");

        int score = 55;
        boolean passed = score >= 60;









    }

}
