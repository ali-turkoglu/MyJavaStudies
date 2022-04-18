package day42_Exceptions;

public class DisadventageOfThrowsKeyword {

    public void method1()throws InterruptedException{
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");
    }

    public void method2(){
       // method1();  ----> buradan çağırdığımızda error veriyor.
    }

}
