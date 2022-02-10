package week02;

import java.util.Scanner;   //we need to import scanner class from java utilies
                            //

public class UserInputInfo {
    public static void main(String[] args) {

        //String name= "Ali"; // hard code... input gives before when It is coding
        String name;

        //output goes to console ---println
        System.out.println("output");

        // how can I receive input for my java class

        // 1. create your scanner object
        Scanner nameOfInput = new Scanner(System.in);

        //2. prompt the user for putting input
        System.out.println("Put your name : "); // this is printed out to console

        // 3. get the input
        name = nameOfInput.next();

        // 4. use the value that I read
        System.out.println("name =" + name );

        //

    }


}
