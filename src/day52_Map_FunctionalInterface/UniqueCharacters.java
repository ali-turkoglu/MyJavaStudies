package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<String ,Integer> result=new LinkedHashMap<>();
        List<String > list=new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {

            if (Collections.frequency(list,each)==1){
                result.put(each,1);
            }
        }
        System.out.println(result);


    }
}
/*Write a program that can find the unique characters from a String

        Ex:
        str = "aabcccdeeeef";

        output:
        {b=1, d=1, f=1}*/