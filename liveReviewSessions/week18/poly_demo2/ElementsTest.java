package week18.poly_demo2;

public class ElementsTest {


    public static void main(String[] args) {


        Links links=new Links();
        links.click();
        links.getLinkHref();
        links.getText();

        WebElement loginLink=new Links();
        loginLink.click();
        loginLink.getText();
        loginLink.sendKeys("");
    }




}
