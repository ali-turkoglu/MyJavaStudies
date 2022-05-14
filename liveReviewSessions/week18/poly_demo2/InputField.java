package week18.poly_demo2;

public class InputField implements WebElement {


    public String getValue(){
        System.out.println("Getting value of the InputField");
        return "Selenium";
    }


    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field "+txt);
    }

    @Override
    public void click() {
        System.out.println("");
    }

    @Override
    public String getText() {
        return null;
    }
}
