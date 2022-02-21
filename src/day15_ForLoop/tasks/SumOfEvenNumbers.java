package day15_ForLoop.tasks;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int total=0;

        for (int i = 2; i <=100 ; i+=2) {

            System.out.print((total+=i)+" ");

        }
    }
}
/*
 Write a program that can return the sum of even numbers between 1 to 100
 */