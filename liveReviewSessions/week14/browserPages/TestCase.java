package week14.browserPages;

public class TestCase {

    public static void main(String[] args) {

        // if i want to use fields and methods of browser class: do i have to create an object from browser class?Can i also reach with child class object?
        AmazonHomePage amazonHomePage=new AmazonHomePage("Chrome");

        System.out.println("I am automating: "+amazonHomePage.getName());
        System.out.println("My operating system is: "+Browser.getOSName());


    }
}
