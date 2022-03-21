package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumbers {

    public static void main(String[] args) {

       // write a program that can return the nth largest (max) number from an arraylist

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8,9,9,6,8));

        int n=3;   // kaçıncı en büyük isteniyorsa o kadar removeIf ile max lar silineceği bir loop oluşturulur
        for (int i = 0; i < 3; i++) {
            list.removeIf(p-> Collections.max(list)==p);
        }


        int max= Collections.max(list);
        System.out.println("max = " + max);


    }
}
