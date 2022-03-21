package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice1 {

    public static void main(String[] args) {

        // write a program that can remove all the city names that have length of 7 or greater
        String [] cities={"Ankara","Istanbul","Izmir","Mersin","Tokat","Karaman","Afyon","Antalya"};

        // converting array to arraylist
        ArrayList<String> list=new ArrayList<>(Arrays.asList(cities));
        list.removeIf( p -> p.length()>=7);

        // converting arralist to array
        cities=list.toArray(new String[0]); // temp length of array
        System.out.println(Arrays.toString(cities));
    }
}
