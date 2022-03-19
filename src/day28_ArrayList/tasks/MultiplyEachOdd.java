package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyEachOdd {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int each=list.get(i);
            if (each%2!=0){
                list.set(i,each*2);
            }
        }
        System.out.println(list);
    }
}
/*write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]



 */