package week19;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {

        List<String > list1=new ArrayList<>();
        ArrayList<String > arrayList1=new ArrayList<>();

        List<String > list2=new Stack<>();

        list1.add("Ali");
        list1.add("Oscar");
        list1.addAll(Arrays.asList("Selena","Cemal","Ali",null,null));
        System.out.println("list1 = " + list1);

        list2.addAll(list1);
        System.out.println("list2 = " + list2);

        System.out.println("-------------------------------------------------------------");

        // peek() --> brings you the element which last LIFO
        // pop()  -->
        // push() -->

        System.out.println("-----------------------------------------------------");

        // Collections Utility class with useful methods: ex  sorting

        //Collections.sort(list1);
        //System.out.println("list1 = " + list1);

        List<Integer> list3=new Stack<>();
        list3.addAll(Arrays.asList(10,20,20,30,30,10,51,320,65,21,45));
        System.out.println("list3 = " + list3);
        Collections.sort(list3);
        System.out.println("list3 = " + list3);

        System.out.println("------------------------------------------------");

        List<Integer> list4=new LinkedList<>();
        list4.addAll(Arrays.asList(22,33,44,55,66));
        ((LinkedList<Integer>) list4).addFirst(1);
        ((LinkedList)list4).addLast(1);

        System.out.println("list4 = " + list4);
        ((LinkedList<Integer>)list4).poll();
        System.out.println("list4 = " + list4);




    }
}
