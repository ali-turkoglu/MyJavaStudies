package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String [] arr={"Wooden Spoon","Book","Pen","Phone","Wooden Spoon","Wooden Spoon","Coke"};

        String [] arr2=new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        String [] arr3=new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);


        /*
        Set<String> set1=new HashSet<>(Arrays.asList(arr));
        arr=set1.toArray(new String[0]);
        */

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("------------------------------------------");

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,30,4000,2000,20,10,60,60,900,20,400,400,10,500,40));
        list=new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println("list = " + list);


    }
}
