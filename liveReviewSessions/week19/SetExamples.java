package week19;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> list=new HashSet<>();  // does not allow duplicates
        list.addAll(Arrays.asList(1,2,3,1,2,3,4,5,6,3,2,1,5,63,5));

        System.out.println("list = " + list); //  list = [1, 2, 3, 4, 5, 6, 63]

        System.out.println("---------------------------------");
        String str="xxxxxxxxxdddddddseettttttttggghhhhaaaaaaabbbbbccccccccddddddeeeeeeeeffff";
        List<String> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(str.split("")));
        //System.out.println("list2 = " + list2);

        Set<String> listSet=new HashSet<>();
        listSet.addAll(list2);
        System.out.println("listSet = " + listSet);


        System.out.println("------------------------------------------------------");


        List<String> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(str.split("")));
        //System.out.println("list3 = " + list3);

        Set<String> listTreeSet=new TreeSet<>();
        listTreeSet.addAll(list3);
        System.out.println("listTreeSet = " + listTreeSet);

    }
}
