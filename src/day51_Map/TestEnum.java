package day51_Map;

public class TestEnum {

    public static void main(String[] args) {

        Browser browser=Browser.CHROME;

        switch (browser){
            case EDGE:
                System.out.println("EDGE selected");
                break;

            case OPERA:
                System.out.println("OPERA selected");
                break;

            case CHROME:
                System.out.println("CHROME selected");
                break;

            case SAFARI:
                System.out.println("SAFARI selected");
                break;

            case FIREFOX:
                System.out.println("FIREFOX selected");
                break;
        }

        System.out.println("--------------------------------------------------");

        Season season=Season.SUMMER;


    }
}
