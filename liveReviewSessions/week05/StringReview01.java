package week05;

public class StringReview01 {
    public static void main(String[] args) {

        String str1="Java";     // literal way of creating a string

        String str2="Java";

        String str3=new String("Java");     //new keyword way of creating a string

        System.out.println(str1==str2);     // true---> the same object(the same object in memory)

        System.out.println(str1==str3);     // false---> not the same object(they have different location in memory)

        //equals is checking the value of object, is it true or false.
        // == is checking the object. they are the same object or not.

        String str4=new String("JAVA");

        // if we want to check case sensitivity
        System.out.println(str2.equals(str4));  // false
        System.out.println(str2.equalsIgnoreCase(str4)); // true


    }
}
