package week17.interface_demo;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver1=new ChromeDriver();
        FirefoxDriver driver2=new FirefoxDriver();


        WebDriver driver3=new ChromeDriver();

        driver1.get("www.google.com");
        driver1.findElement("//input[@name='q']");

        System.out.println("Title: "+ driver1.getTitle());

    }

}
