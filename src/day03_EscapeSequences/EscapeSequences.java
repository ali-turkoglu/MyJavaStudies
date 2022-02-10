package day03_EscapeSequences;

/*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space(tab)
    \\: single back slash
    \": double quote
 */

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        System.out.println("Hello Cydeo \nHow are you today? \nIt is nice to see you all! \nWhat class do we have next week?");
        System.out.println("----------------------------------------------");
        System.out.println("\tJava is Cool Programming Language \t \tWhat about the others?");
        System.out.println("\tJava is Cool Programming Language \tWhat about the others?");
        System.out.println("------------------------------------------------------------------");
        System.out.println("/ \\");
        /*bir tane backslash yapmak için 2 tane koymak gerekiyor.
        çünkü backslash java komut içerisinde kullanıldığı için
        metin olarak kullanmak için öncesinde bir backslash kullanılmalı
         */
        System.out.println("--------------------------------------");
        System.out.println("\"");
        System.out.println("My favorite TV show is \"HomeLand\""); //in order to print double quote we must use backslash before doublequote

    }


}
