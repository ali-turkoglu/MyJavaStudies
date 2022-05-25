package day52_Map_FunctionalInterface;

import java.util.*;

public class $$HighestFrequency {

    public static void main(String[] args) {

        String str="eeeeeaaabbbbccccdd";

        List<String > list=new ArrayList<>(Arrays.asList(str.split("")));

        Map<String ,Integer> strMap=new LinkedHashMap<>();


        int frequency=0;
        for (String each : list) {
            frequency=Collections.frequency(list,each);

        }


    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency

 */