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

        System.out.println("-------------------------------------------");

        // create a function that can return the maximum number from an int array

        Function<int[],Integer> maxNumber= a -> {
            Integer max=Integer.MIN_VALUE;
            for (int each : a) {
                if (each>max){
                    max=each;
                }
            }
            return max;
        };

        int[] test={1,23,51,30,26,45,84,45,24,87};
        System.out.println(maxNumber.apply(test));

        System.out.println("------------------------------------------------------------------");

        // create a function that can swap the first and last elements of an array

        Function<int[],int[]> swapFirstAndLast= a -> {

            int temp=a[0];
            a[0]=a[a.length-1];
            a[a.length-1]=temp;
            return a;
        };
        System.out.println(Arrays.toString(swapFirstAndLast.apply(test)));

        System.out.println("==================================================================");


        // Create a function that can reverse an array and returns it
        Function<int[],int[]> reverseArray= a -> {
            int[] result3=new int[a.length];
            for (int i = a.length - 1,j=0; i >= 0; i--,j++) {
                result3[j]=a[i];
            }
            return result3;
        };
        System.out.println(Arrays.toString(reverseArray.apply(test)));


        // create a function that can reverse a List





    }
}
