package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,2,3,1,5,4,6,7));
        Collections.sort(list);

        System.out.println("------------------------------------------------------------------");

        ArrayList<Character> listCh=new ArrayList<>();
        listCh.addAll(Arrays.asList('a','b','c','d'));
        Collections.reverse(listCh);
        System.out.println(listCh);

        Collections.sort(listCh);
        System.out.println(listCh);

        Collections.swap(listCh,1,2);
        System.out.println(listCh);

        System.out.println("---------------------------------------------------------------");

        int max=Collections.max(list);
        System.out.println("max: "+max);

        int min=Collections.min(list);
        System.out.println("min: "+min);

        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> list4=new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,30,30,40,50,60,70));
        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);

        System.out.println("----------------------------------------------------------------");

        int frequency =Collections.frequency(list4,30);
        System.out.println("frequency = " + frequency);


        ArrayList<String> list3=new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","Java")); // to remove starts with j

        int countJava=Collections.frequency(list3,"Java");
        System.out.println("countJava = " + countJava);



    }

}
