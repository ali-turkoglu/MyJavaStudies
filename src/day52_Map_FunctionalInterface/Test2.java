package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        // function1: create a function that can display a number is odd or even

        MySecondFunctionalInterface<Integer> OddOrEven=(p)-> {

            if (p%2==0){
                System.out.println(p+" is even number");
            }else {
                System.out.println(p+" is odd number");
            }
        };
        OddOrEven.test(66);

        // print each char the given String

        MySecondFunctionalInterface <String > printEach;
        printEach= (s)->{
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("Wooden Spoon");

        //function3: create a function that can display the cube of a number

        MySecondFunctionalInterface<Integer> cube= n -> System.out.println(n*n*n);

        cube.test(3);


    }
}
