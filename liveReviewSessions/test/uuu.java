package test;

import day34_GarbageCollection_AccessModifiers.Constructor_vs_StaticBlock;
import day34_GarbageCollection_AccessModifiers.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class uuu {

    public static void main(String[] args) {

        String str="elma armut elma portakal erik elma armut";

        List<String > list= Arrays.asList(str.split(" "));

        int max=0;
        for (String each : list) {
            int temp=0;
            for (String each2 : list) {
                if(each.contains(each2)){
                    temp++;
                }
            }
            if(temp>max){
                max=temp;
            }
        }


        System.out.println(list);
        System.out.println(max);

        
    }

}
