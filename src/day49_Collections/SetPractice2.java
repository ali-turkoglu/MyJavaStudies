package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String [] array={"A","B","C","A"};
        List<String > s=new ArrayList<>(Arrays.asList(array));

        System.out.println("-------------------------------------------------");

        String str="eeeeeeaaaaaabbbcccccdd";
        
                        //eabcd
                        //66352

        String result="";

        System.out.println("new LinkedHashSet<>(Arrays.asList(str.split(\"\"))) = " + new LinkedHashSet<>(Arrays.asList(str.split(""))));

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result+=each+ Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(result);  //  e6a6b3c5d2


        String result2="";
        for (String each : new ArrayList<>(Arrays.asList(str.split("")))) {
            result2+=each+ Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(result2);  //  e6e6e6e6e6e6a6a6a6a6a6a6b3b3b3c5c5c5c5c5d2d2


        System.out.println("---------------------------------------------------");

        Integer[] nums={1,1,1,1,1,2,2,2,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums=new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------------------");

        Set<String > names=new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet","Ahmet","John","Naim","Ahmet","Shay"));

        System.out.println(names.toArray(new String[0])[2]); // Naim

        System.out.println(new ArrayList<>(names).get(2));  // Shay

        for (String  each : names){
            System.out.println(each);
        }




    }
}
