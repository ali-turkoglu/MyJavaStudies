package week13.inheritance;

import java.util.Arrays;

public class BookShop {

    public static void main(String[] args) {


        AudioBook a1 = new AudioBook("Madam Bovary", "Novel", "Gustave Flaubert", 23);

        EBook eb1 = new EBook("Intro to java", "savitch", "programming", 55);

        System.out.println(a1);
        System.out.println(eb1);
    }
}