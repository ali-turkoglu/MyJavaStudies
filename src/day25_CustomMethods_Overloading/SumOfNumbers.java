package day25_CustomMethods_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        System.out.println(sumOfNumbers(65,848));

        int sum=sumOfNumbers(65,15);
        System.out.println(sum);

        System.out.println(sumOfThree(32,65,45));

        System.out.println(sumOfFour(98,12,15,32));

    }

    public static int sumOfNumbers(int num1,int num2){

        //int sum=num1+num2;
        return num1+num2;
    }


    public static int sumOfThree(int num1,int num2,int num3){

        return num1+num2+num3;
    }


    public static int sumOfFour(int num1,int num2,int num3,int num4){

        return num1+num2+num3+num4;
    }
}
/*1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */