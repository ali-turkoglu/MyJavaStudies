package day11_SwitchScanner.tasks;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        System.out.println("Enter one of the batch in Cydeo:\n\t1 - US morning\n\t2 - US evening\n\t3 - EU");
        Scanner input=new Scanner(System.in);
        String batch=input.nextLine();

        if (batch.equals("1") || batch.equals("US morning")){
            System.out.println("1 - US morning\nClass times are 10-5 EST. M, T, Th, F.");
        }else if (batch.equals("2")||batch.equals("US evening")){
            System.out.println("2 - US evening\nClass times are 7-10 EST. M, T, W, Th, S, S");
        }else if (batch.equals("3")||batch.equals("EU")){
            System.out.println("3 - EU\nClass times are  10-5 EST. M, T, W, Th, F.");
        }else{
            System.err.println("Invalid Batch");
        }

    }
}
/*Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */