package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0) : ");

        int value;

        do {
            value=input.nextInt();
            if (!list.contains(value )&& value!=0){
                list.add(value);
            }
        }while (value !=0);

        for (Integer each : list) {
            System.out.println(each+" ");
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        int max= Collections.max(list);
        int min=Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        Collections.shuffle(list); // random shuffle
        System.out.println(list);


    }
}
//it will get input from user, and only will store distinct numbers to our arraylist