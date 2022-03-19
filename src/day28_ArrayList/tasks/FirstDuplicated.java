package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,3,4,5,7,6,0,7));
        System.out.println(list);

        int firstDuplicated=list.get(0);
        for (Integer each : list) {
            int frequency=0;
            for (Integer each2 : list) {
                if (each==each2){
                    frequency++;
                }
            }
            if (frequency>1){
                firstDuplicated= each;
                break;
            }
        }
        System.out.println("firstDuplicated = " + firstDuplicated);
    }

}
/*Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2

 */

