package test;

import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

        String str1="abcdabcdabcd";
        String str2="aaabbbcccddd";

        char [] ch1= str1.toLowerCase().toCharArray();
        char [] ch2=str2.toLowerCase().toCharArray();


/*
        // method 1

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equals = Arrays.equals(ch1, ch2);

        if(equals){
            System.out.println(str1+" and "+str2+" are Anagram.");
        }else {
            System.out.println(str1+" and "+str2+" are not Anagram.");
        }
*/

        //===============================================
        //method 2

        //char[] temp1=new char[ch1.length];
        String temp1="";


/*
        for (int i = 0; i < ch1.length-1; i++) {

            for (int j = ch1.length-1; i<=j ; j--) {

                if (ch1[j]<ch1[]){
                    temp1=ch1;
                }else {
                    temp1[i]=ch1[j];
                }

            }

        }
*/

        char [] strArr={'a','c','b','a','e'};

            int numberOfStep= strArr.length-1;  //4

            for (int i = 0; i < strArr.length - 1; i++) { // 1

                numberOfStep--; //

                for (int j = 0; j < strArr.length-1; j++) { //3

                    char temp = ' ';

                    if (strArr[j] > strArr[j + 1]) {

                        temp = strArr[j]; // delibekir
                        strArr[j] = strArr[j + 1]; // turan
                        strArr[j + 1] = temp;
                    }

                }

            }





    }

}
