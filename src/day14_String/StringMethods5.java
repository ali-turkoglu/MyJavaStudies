package day14_String;

import java.util.Locale;

public class StringMethods5 {
    public static void main(String[] args) {

        String str="";
        boolean r=str.isEmpty();
        System.out.println("r = " + r);

        String str2=" ";
        boolean s=str2.isEmpty();
        System.out.println("s = " + s);

        System.out.println("_________________________________________");

        String b1="" , b2=" " , b3="  a";
        System.out.println("b1 = " + b1.isBlank());
        System.out.println("b2 = " + b2.isBlank());
        System.out.println("b3 = " + b3.isBlank());

        System.out.println("__________________________________________________");

        String s1="cydeo", s2="CYDEO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("____________________________________________________");

        String sentence="My favorite programming language is Java";
        boolean hasCSharp=sentence.contains("C#");      // false
        boolean hasJava1=sentence.contains("Java");     // true
        boolean hasJava2=sentence.contains("java");     // false
        boolean hasJava3=sentence.toLowerCase().contains("java");   //true

        System.out.println("_____________________________________________________");

        String input1="I love Java";
        String input2="Java";

        System.out.println(input1.equals(input2));              //false
        System.out.println(input1.equalsIgnoreCase(input2));     //false
        System.out.println(input1.contains(input2));            //true


        System.out.println("______________________________________________________");

        String a="Wooden Spoon";
        System.out.println(a.startsWith("Woo"));    //true
        System.out.println(a.startsWith("woo"));    //false
        System.out.println(a.toLowerCase().startsWith("woo"));  //true
        System.out.println(a.startsWith("oo"));     //false

        System.out.println(a.endsWith("Spoon"));    //true
        System.out.println(a.endsWith("spoon"));    //false
        System.out.println(a.endsWith("Spoo"));     //false
        System.out.println(a.toLowerCase().endsWith("spoon"));  //true











    }
}
