package week18.poly_demo2;

public class WebElementUtility {

    public static void clickElement(WebElement element){
        System.out.println("Clicking on the Element");
        element.click();
    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt "+ txt);

        return new Links();
    }
}
