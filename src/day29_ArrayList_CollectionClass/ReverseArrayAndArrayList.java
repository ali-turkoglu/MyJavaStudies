package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6};

        int[] arrayReverse=new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            arrayReverse[j]=array[i];
        }
        System.out.println("array"+Arrays.toString(array));
        System.out.println("arrayReverse"+Arrays.toString(arrayReverse));

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> listReverse=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            listReverse.add(list.get(i));
        }
        System.out.println("list = " + list);
        System.out.println("listReverse = " + listReverse);


    }
}
