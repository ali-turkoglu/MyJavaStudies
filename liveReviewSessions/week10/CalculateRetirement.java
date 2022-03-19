package week10;

public class CalculateRetirement {

    public static void main(String[] args) {

        yearsUntilRetirement("Oscar",1975);

    }


    public static int age(int yearOfBirth){
        return 2022-yearOfBirth;
    }


    public static void yearsUntilRetirement(String name,int yearOfBirth){

        int retirementyear=65-age(yearOfBirth);
        System.out.println(name+" retires in " +retirementyear+" years");
    }


}
