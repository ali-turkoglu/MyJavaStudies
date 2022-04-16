package week14.browserPages;

public class Browser {

    private String browserType;

    private static String operatingSystem;

    static {
        operatingSystem="Windows";
    }

    public Browser(String name){
        browserType=name;
    }

    public String getName(){
        return browserType;
    }

    private void closeBrowser(){ // this method is created so we can use before setting a new one
        browserType=null;
    }

    public void setName(String name){ // our setter method checks if there is already an open browser setting a new one
        if (browserType==null)
            this.browserType=name;
        else
            System.out.println("There is already an open browser: "+browserType);
            //only sets a new one if there is no browser assigned

    }

    public static String getOSName(){
        return operatingSystem;
    }

}
