package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

       String str="aaabcccdeeefkkkllllmnnnnnz";

        ArrayList<String> list=new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("List = " + list);

        System.out.println("------------------------------------------------------");

        String unique="";

        for (String each : list) {
            int count=Collections.frequency(list,each);
            if (count==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);


    }
}
