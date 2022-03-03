package day21_ArrayUtility_ForEachLoop.tasks;

public class Palindromes {

    public static void main(String[] args) {

        String [] str= {"anna", "level", "Java"};
        int count=0;
        for (String each : str) {

            String str2="";
            for (int i=each.length()-1;i>=0;i--){
                str2+=each.charAt(i);
            }
            if(each.equals(str2)){
                count++;
            }

        }
        System.out.println(count);
    }
}
/*
    write a program that can count how many palindromes in an array of string
        Ex:
                {"anna", "level", "Java"};

                output:
                2
*/
