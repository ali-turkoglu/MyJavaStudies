package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface <String > stringReverse=(s)->{
            String reverse=new StringBuilder(s).reverse().toString();
            return reverse;
        };

        System.out.println(stringReverse.apply("Wooden Spoon"));

        MyThirdFunctionalInterface<Integer> cube= n -> {
            return n*n*n;
        };
        System.out.println(cube.apply(3));


    }
}
