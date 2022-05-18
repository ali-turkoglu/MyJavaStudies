package day50_Collection_Iterable;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("set = " + set);

        //Integer [] array=set.toArray(new Integer[0]);
        //System.out.println("array = " + array);

        List<Integer> list=new ArrayList<>(set);
        System.out.println("list = " + list);

        System.out.println("---------------------------------------");

        List<String > listNames=null;
        System.out.println("listNames = " + listNames);
        //System.out.println("listNames.size() = " + listNames.size()); ---> NullPointerException

        Set<String > setNames=null;
        System.out.println("setNames = " + setNames);
        //System.out.println("setNames.size() = " + setNames.size());   ---> NullPointerException


    }
}
