package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6));

        //list.remove(0);

        list.remove(Integer.valueOf(1));

        System.out.println("-----------------------------------------");
        //  array to array list

        String [] array={"yellow","blue","black"};
        ArrayList<String > list1=new ArrayList<>(Arrays.asList(array));
        System.out.println(list1);

        System.out.println("-----------------------------------------");

        // arraylist to array

        String [] newArr= new String[list1.size()];
        list1.toArray(newArr);
        System.out.println(Arrays.toString(newArr));

        System.out.println("--------------------------------------------");
        // how to make an int array to an Integer Arraylist

        int [] arrayThree={1,2,3,4,5};
        ArrayList<Integer> numList=new ArrayList<>();

        for (Integer each : arrayThree) {
            numList.add(each);
        }
        System.out.println(numList);


    }
}
