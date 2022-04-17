package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee=null;

        try {

            System.out.println(employee.getSalary()); //NullPointerException

        }catch (IndexOutOfBoundsException e){

            System.out.println("1.catch block");
            e.printStackTrace();

        }catch (ArithmeticException e){

            System.out.println("2.catch block");
            e.printStackTrace();

        }catch (NullPointerException e){

            System.out.println("3.catch block");
            e.printStackTrace();

        }catch (RuntimeException e){

            System.out.println("4.catch block");
            e.printStackTrace();

        }

        System.out.println("Test completed");



    }
}
