package day23_CustomMethods_Void.tasks;

public class FullNameOfPerson {

    public static void main(String[] args) {

        String firstName="cYdeO";
        String lastName="sCHooL";

        fullName(firstName,lastName);

    }

    public static void fullName(String firsName,String lastName){

        String fullName=firsName.substring(0,1).toUpperCase()+firsName.substring(1).toLowerCase()+" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(fullName);

    }
}
/*write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"

 */