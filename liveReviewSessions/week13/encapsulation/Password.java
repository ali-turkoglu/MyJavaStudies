package week13.encapsulation;

import java.util.Scanner;

public class Password {

    private String password;

    public Password(){

    }

    Scanner input=new Scanner(System.in);

    public String getPassword(){
        if (password==null){
            System.out.println("password is null. Assign a value it");
            password=input.next();
        }
        return password;
    }


}
