package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);


        list.removeAll(Arrays.asList(3, 5, 8));
        System.out.println(list);


        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600));


        numbers.retainAll(Arrays.asList(100, 200, 300)); // remove non-matching
        System.out.println(numbers);

        System.out.println("---------------------------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developers", "Scrum Master", "BA", "BA", "QA", "SDET"));

        boolean b1 = jobTitles.contains("BA") && jobTitles.contains("QA") && jobTitles.contains("SDET");
        boolean b2 = jobTitles.containsAll(Arrays.asList("BA", "QA", "SDET"));
        // b1 true,  b2 true

        System.out.println("b1 = "+b1);
        System.out.println("b2 = " + b2);

        System.out.println("----------------------------------------------------------------");

        String [] names={"John","Jack","Daniel","Shay"};
        ArrayList<String> nameslist1=new ArrayList<>();
        nameslist1.addAll(Arrays.asList(names));  // arrays data grubunu ArrayList e dönüştürüyoruz.

        ArrayList<String> nameslist2=new ArrayList<>(Arrays.asList(names));

        System.out.println("---------------------------------------------------------------");

        int[] arr={1,2,3,4,5,6,7};

        ArrayList<Integer> list2=new ArrayList<>();
        list2=convertArrayToArrayList(arr);

        System.out.println("list2 = " + list2);

        char[] ch={'a','b','c','d'};
        ArrayList<Character> listChar=new ArrayList<>();
        listChar=convertArrayToArrayList(ch);
        System.out.println("listChar = " + listChar);

        double[] d1={2.2,4.4,54.3,12.3};
        ArrayList<Double> listDouble=new ArrayList<>();
        listDouble=convertArrayToArrayList(d1);
        System.out.println("listDouble = " + listDouble);

    }

    // convert array to ArrayList, return Integer ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }


    // convert array to ArrayList, returns Double ArrayList
    public static ArrayList<Double> convertArrayToArrayList(double[] array){
        ArrayList<Double> list=new ArrayList<>();
        for (double each : array) {
            list.add(each);
        }
        return list;
    }

    // convert array to ArrayList, returns Character ArrayList
    public static ArrayList<Character> convertArrayToArrayList(char[] array){
        ArrayList<Character> list=new ArrayList<>();
        for (char each : array) {
            list.add(each);
        }
        return list;
    }
}
