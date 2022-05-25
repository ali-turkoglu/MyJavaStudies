package day52_Map_FunctionalInterface;

// lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        // function1: create a function that can display a number is odd
        MyFirstFunctionalInterface OddOrEven=(p)  -> {
            if (p%2==0){
                System.out.println(p+" is even number");
            }else {
                System.out.println(p+" is odd number");
            }
        };

        OddOrEven.apply(20);
        // 20 is even number


        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol=(age)->{
            if (age>=18){
                System.out.println("Eligible to buy alcohol");
            }else {
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(16);


        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube=(n)->{
            System.out.println(n*n*n);
        };

        printCube.apply(3);

        //function4: create a function that can check if a number is evenly divisble by  3 & 5
        MyFirstFunctionalInterface divisible3And5=n-> System.out.println((n%3==0)? n+" is divisible 3":(n%5==0)?n+" is divisible 5":n+" is not divisible 3 or 5");
        divisible3And5.apply(78);
        divisible3And5.apply(79);
        divisible3And5.apply(80);






    }
}
