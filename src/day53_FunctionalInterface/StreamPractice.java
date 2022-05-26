package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));

        // distinct()  --> eliminate duplicated but to save new list we use collect() method
        // collect() --->  save as a List or Map or Set or Collection

        list1= list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        int [] arr1={1,1,2,2,3,3,4,4,5,5,6,6};
        arr1=Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2=list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2);

        // toArray
        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        arr2=Arrays.stream(arr2).skip(4).toArray();

        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list3=list3.stream().limit(7).collect(Collectors.toList());
        System.out.println(list3);

        // skip() + limit()
        List<Integer> list32=list1.stream().skip(3).limit(7).collect(Collectors.toList());
        System.out.println(list32);

        System.out.println("-------------------------------------------------");

        // to multiply each element by 10

        // map()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list4=list4.stream().map(a-> a*10).collect(Collectors.toList());
        System.out.println(list4);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days=days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());
        System.out.println(days);

        System.out.println("--------------------------------------------------");

        // filter()
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> even=list5.stream().filter(p->p%2==0).collect(Collectors.toList());

        //how many names "java" in the list
        // count()
        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));

         int countJava = (int)names.stream().filter(p->p.equalsIgnoreCase("java")).count();

        System.out.println(countJava);

        System.out.println("-------------------------------------------------------");

        // forEach()
        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));

        System.out.println("-----------------------------------------------------------");

        // allMatch()   anyMatch()      nonMatch()
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list6.stream().allMatch(p -> p % 2 == 0));

        System.out.println(list6.stream().anyMatch(p -> p % 2 == 0));


        System.out.println(list6.stream().noneMatch(p -> p >20));



    }
}
