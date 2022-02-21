package day17_While_DoWhileLoop;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your user name and password:");
        String userName=input.next();
        String password=input.next();



        if (userName.equals("Cydeo")&&password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempt = 3;

            while ( !(userName.equals("Cydeo")&&password.equals("Cydeo123")) && attempt > 0 ){
                if (attempt==1){
                    System.out.println("This is your last attempt");
                }else if(attempt==2){
                    System.out.println("You have 2 attempt to try");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your user name and password:");
                userName=input.next();
                password=input.next();
                attempt-=1;

            }
            if ( userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }


        input.close();

/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Cydeo")  && p.equals("Cydeo123") ){ // if credentials are valid

            System.out.println("Logged in");

        }else{ // if credentials are not valid
            int attempts = 3; //3, 2, 1

            while( !(u.equals("Cydeo")  && p.equals("Cydeo123")) &&  attempts > 0 ){ // while the credentials are invalid, and user has attempts to reenter

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }

            if(u.equals("Cydeo")  && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }

        }

        scan.close();

*/

    }
}



/*
You are writing a code for the log-in function of the Cybertek Application,

assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                to have three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is locked."

    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}

*/