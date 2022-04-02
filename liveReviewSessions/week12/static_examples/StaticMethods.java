package week12.static_examples;

public class StaticMethods {

    public int num=10;

    public static int count= 5;

    public static void displayMessage(String message){
        System.out.println("message"+ message);
        // System.out.println(num);  --> we can not call instance variable from static method
        System.out.println(count);
    }

    public void instanceMethod(){
        System.out.println(num);
        System.out.println(count);
        displayMessage("Hello from instance method");
    }


}
