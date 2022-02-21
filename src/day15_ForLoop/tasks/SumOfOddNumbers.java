package day15_ForLoop.tasks;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int total=0;
        for (int i = 1; i <100 ; i+=2) {
            System.out.print((total+=i)+" ");
        }
    }
}
/*
Write a program that can return the sum of odd numbers between 1 to 100
 */