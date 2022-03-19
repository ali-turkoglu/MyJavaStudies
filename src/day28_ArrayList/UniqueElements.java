package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

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

        boolean isUnique=characters.indexOf('B')==characters.lastIndexOf('B');
        System.out.println("isUnique: "+isUnique);

        ArrayList<Character> unique=new ArrayList<>();
        for (Character each : characters) {
            if (characters.indexOf(each)==characters.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);

    }
}
