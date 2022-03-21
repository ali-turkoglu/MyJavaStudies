package day29_ArrayList_CollectionClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf_Method {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.removeIf( p -> p < 5 );  // lambda expressions -> ,  p represent each elements

        System.out.println("list = "+list);

        System.out.println("------------------------------------------");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); // to remove all the even numbers
        list2.removeIf( p -> p%2==0);
        System.out.println("list2 = " + list2);

        System.out.println("---------------------------------------------------");

        ArrayList<String> list3=new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","Java")); // to remove starts with j
        list3.removeIf(each -> each.toLowerCase().charAt(0)=='j');
        System.out.println("list3 = " + list3);

        System.out.println("---------------------------------------------------");

        // to remove if the element is palindrome, we are using StringUtility isPalindrome Custom Method we did before
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("anna","racecar","level","eye","Python","cydeo"));
        names.removeIf( p -> StringUtility.isPalindrome(p));  // palindrome olmayanı silmek için ( p -> !St... )
        System.out.println("names = " + names);


    }
}
