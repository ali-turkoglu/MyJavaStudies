package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAverage {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(148, 211, 633, 395, 65, 69, 684));

        System.out.println(list);

        int max=list.get(0);
        int min=list.get(0);
        int sum=0;

        for (Integer each : list) {
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
            sum+=each;
        }
        double average=(double) sum/list.size();

        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
