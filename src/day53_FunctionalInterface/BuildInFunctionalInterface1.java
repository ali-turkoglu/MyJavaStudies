package day53_FunctionalInterface;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {


        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equals(p);

        };

        boolean result = isPalindrome.test("Java");

        System.out.println(result);

        Predicate<Integer> isEven= p -> p%2==0;

        System.out.println("--------------------------------------------------");

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,5,3,2,1,2,6,7));
        list.removeIf(isEven);
        System.out.println(list);

        System.out.println("----------------------------------------------------");

        List<String > names= new ArrayList<>();
        names.addAll(Arrays.asList("Level","anna","java","python"));

        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("-----------------------------------------------------");

        Consumer<String > printEach=( s ) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("---------------------------------------------------------");


        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,5,3,2,1,2,6,7));

        list2.forEach(p-> { if (p%2 != 0) System.out.println(p);}  );

        System.out.println("--------------------------------------------------------");

        List<String > employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s-> {
            System.out.println(s.charAt(0)+"."+s.substring(s.lastIndexOf(" ")).charAt(1));
        });

        System.out.println("----------------------------------------------------------");

        Function<int[],List<Integer>> convertToList= a -> {
            List<Integer> result1=new ArrayList<>();
            for (int each : a) {
                result1.add(each);
            }
            return result1;
        };

        int[] arr={1,2,3,4,5,6};
        List<Integer> list1=convertToList.apply(arr);
        System.out.println(list1);

        System.out.println("-----------------------------------------------------");

        Function<List<Integer>,int[]> convertToArray= l -> {
            int [] arr1= new int[l.size()];
            for (int i = 0; i < l.size(); i++) {
                arr1[i]=l.get(i);
            }

            return arr1;


        };


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int[] result2 = convertToArray.apply(numbers);
        System.out.println(Arrays.toString(result2));



    }
}
