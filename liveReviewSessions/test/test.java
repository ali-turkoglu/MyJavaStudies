package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 = " + s1 == s2);
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println(s1 == s2);

    }

}
/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.

 */