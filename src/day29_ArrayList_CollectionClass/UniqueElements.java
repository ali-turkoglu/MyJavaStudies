package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list4=new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,30,30,40,50,60,70));

        ArrayList<Integer> unique=new ArrayList<>();

        for (Integer each : list4) {
            int frequency=Collections.frequency(list4,each);  // finds the frequency of each element
            if (frequency==1){
                unique.add(each);
            }

        }
        System.out.println("unique = " + unique);

        ArrayList<Integer> list5=new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,20,30,30,30,40,50,60,70));

        ArrayList<Integer> unique2=new ArrayList<>(list5);
        unique2.removeIf(p-> Collections.frequency(unique2,p)>1); // remove if the frequency is greater than 1
        System.out.println("unique2 = " + unique2);

    }
}
