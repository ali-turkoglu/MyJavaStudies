package day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        // write a program that can swap the fist and last elements of an ArrayList
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);

        System.out.println("------------------------------------------------------------");

        // write a program that can move all the zeros to the last indexes of ArrayList

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(0,1,2,0,0,3,4,0,0,5,6));
        System.out.println(list2);

        int size= list2.size();
        list2.removeAll(Arrays.asList(0));
        int newSize= list2.size();
        int totalNumberOfZeros=size-newSize;
        System.out.println(list2);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list2.add(0);
        }
        System.out.println(list2);

        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(0,1,2,0,0,3,4,0,0,5,6));

        ArrayList<Integer> result=new ArrayList<>();

        for (Integer each : list3) {
            if (each!=0){
                result.add(each);
            }
        }
        for (Integer each : list3) {
            if (each==0){
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("-----------------------------------------------------------");

        //

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf(p->!Character.isLetter(p));

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p->!Character.isDigit(p));

        ArrayList<Character> specialsChar = new ArrayList<>(chars);
        specialsChar.removeIf(p->Character.isLetterOrDigit(p));

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialsChar = " + specialsChar);


    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */
