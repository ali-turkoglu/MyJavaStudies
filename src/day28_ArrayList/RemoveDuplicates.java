package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('D');
        characters.add('E');

        ArrayList<Character> ch2=new ArrayList<>();
        for (Character each : characters) {
                if (!ch2.contains(each)) {
                    ch2.add(each);
                }
        }
        System.out.println(ch2);
    }
}
