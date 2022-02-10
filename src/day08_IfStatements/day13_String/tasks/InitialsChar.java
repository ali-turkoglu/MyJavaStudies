package day08_IfStatements.day13_String.tasks;

public class InitialsChar {

    public static void main(String[] args) {


        String name="cyber security";
        name=name.toUpperCase();
        char ch1=name.charAt(0);
        char ch2=name.charAt(name.indexOf(" ")+1);

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

    }
}
