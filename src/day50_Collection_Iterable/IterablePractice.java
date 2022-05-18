package day50_Collection_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        
        // remove all the elements that aew less than 4

        /*Integer[] arr=list.toArray(new Integer[0]);

        String result="";


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=4){
               result+=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("result = " + result);
        list=new ArrayList<Integer>(Integer.parseInt(result));
        System.out.println(list.size());*/

        System.out.println("-----------------------------------------------------");

        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> it=list2.iterator();
       /* Boolean r1=it.hasNext();
        System.out.println("r1 = " + r1);
        System.out.println(it.next());


        Boolean r2=it.hasNext();
        System.out.println("r2 = " + r2);
        System.out.println(it.next());*/


        while (it.hasNext()){
            if (it.next()<4){
                it.remove();
            }
        }

        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------------");

        List<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (Iterator<Integer> i=list3.listIterator(); i.hasNext(); ) {

            if (i.next()<4){
                i.remove();
            }
        }
        System.out.println(list3);

        System.out.println("------------------------------------------------");

        List<Integer> list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf(each ->each<4);

    }
}
