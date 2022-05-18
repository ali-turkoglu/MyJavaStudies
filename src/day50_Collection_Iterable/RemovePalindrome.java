package day50_Collection_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindrome {

    public static void main(String[] args) {

        //  remove palindrome without lambda

        List<String > names= new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","Cydeo","Car","Level","kayak","racecar","civic"));

        Iterator<String> it=names.iterator();

        while (it.hasNext()){

            String each=it.next();
            String reverse="";

            for (int i = each.length()-1; i >=0; i--) {
                reverse+=each.charAt(i);

            }
            if ((each.equalsIgnoreCase(reverse))){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("---------------------------------------------------");


        // removing with creating custom method

        List<String > names2= new ArrayList<>();
        names2.addAll(Arrays.asList("Java","Python","Cydeo","Car","Level","kayak","racecar","civic"));

        Predicate<String > isPalindrome=str->{
            String reverse="";
            for (int i = str.length()-1; i >=0; i--) {
                reverse+=str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };

        names2.removeIf(isPalindrome);
        System.out.println(names2);

        System.out.println("------------------------------------------------------------");

        // removing palindrome using lambda expression which has more than one statement

        List<String > names3= new ArrayList<>();
        names3.addAll(Arrays.asList("Java","Python","Cydeo","Car","Level","kayak","racecar","civic"));

        names3.removeIf(p->{
            String reverse="";
            for (int i = p.length()-1; i >=0; i--) {
                reverse+=p.charAt(i);
            }
            return reverse.equalsIgnoreCase(p);
        });
        System.out.println(names3);


    }
}
