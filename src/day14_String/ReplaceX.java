package day14_String;

public class ReplaceX {
    public static void main(String[] args) {

        String str="xcodeX";

        str=str.replace("x","a").replace("X","a");

        System.out.println(str);


    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */