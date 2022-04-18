package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadventageOfThrowsKeyword {




    public static void method1(){

        // method1();  ----> buradan çağırdığımızda error veriyor.
        // method3();   --->  "          "
        method4();  //  ---> try & catch ile error çözüldüğü için hata vermiyor
    }


    public static void method2()throws InterruptedException{
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");
    }

    public static void method3() throws FileNotFoundException {
        new FileInputStream("");
    }

    public static void method4(){
        System.out.println("Test started");
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Test completed");
    }

    public static void main(String[] args) {

       // method2();  //----> buradan çağırdığımızda error veriyor.
       // method3();  // --->  "          "
        method4();  //  ---> try & catch ile error çözüldüğü için hata vermiyor


        String a="Cydeo";
        try {
            char ch=a.charAt(10);  // unchecked exception olduğu için try & catch kullanılır sadece
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }



}
