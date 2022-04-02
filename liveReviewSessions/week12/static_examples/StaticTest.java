package week12.static_examples;

public class StaticTest {

    public String instanceValue = "Selenium";

    public static String word="Java";

    public static void main(String[] args) {

        // System.out.println(instanceValue);  --> we can not call instance variable even main method
        System.out.println(word);

        StaticMethods.displayMessage("Hello static function");

        StaticMethods object=new StaticMethods();
        object.displayMessage("Hello, I am using object to call you");

        StaticMethods object2=new StaticMethods();
        System.out.println(object2.num);
        object2.count=15;
        System.out.println(object.count);

        System.out.println("-----------------------------");


        //StaticMethods.instanceMethod();
        // instance method u direk static den çağıramıyoruz
        // çağırmak için bir object üzerinden kullanıyoruz
        object.num=3;
        object2.num=4;

        object.instanceMethod();
        object2.instanceMethod();


    }
}
