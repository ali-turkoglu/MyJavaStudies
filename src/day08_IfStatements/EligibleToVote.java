package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name= "John";
        int age = 39;
        String citizen = "USA";

        boolean isEligible = age >=21 && citizen=="USA";

        // Eligible
        if (isEligible){
            System.out.println("Eligible");
        }

        // Not Eligible
        if (!isEligible){ // !true ====> opposite of true ===> false
            System.out.println("Not Eligible");
        }



    }
}
