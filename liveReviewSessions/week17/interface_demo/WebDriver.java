package week17.interface_demo;

public interface WebDriver {

    void get(String url);
    void findElement(String locator);
    void quit();
    String getTitle();
}
