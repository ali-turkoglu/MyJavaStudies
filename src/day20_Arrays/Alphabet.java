package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet=new char[26];

        for (char i='Z',j=0;i>='A';i--,j++){
            alphabet[j]=i;

        }
        System.out.println(Arrays.toString(alphabet));
    }
}
