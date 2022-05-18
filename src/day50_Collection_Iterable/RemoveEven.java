package day50_Collection_Iterable;

import day17_While_DoWhileLoop.WhileLoopIntro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEven {

    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3,4,5,6,10,21,32,34));

        set.removeIf(p->p %2==0);

        System.out.println(set);

        System.out.println("-------------------------------------------");

        // Without Lambda
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5,6,10,21,32,34));

        Iterator<Integer> it=set1.iterator();

        while (it.hasNext()){
            Integer each=it.next();
            if (each%2==0){
                it.remove();
            }
        }
        System.out.println(set1);

    }
}
