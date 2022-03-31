package week11;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        String [] str={"Ankara","Izmir","Manisa"};
        System.out.println(Arrays.toString(addElement(str,"Van")));
        str=addElement(str,"Balıkesir"); // re-assigned
        System.out.println(Arrays.toString(str));
        str=addElement(str,"Van");
        System.out.println(Arrays.toString(str));

    }


    public static String[] addElement(String[] str, String element){

        String [] newArray=new String[str.length+1];
        int i=0;
        for (String each : str) {
            newArray[i]=str[i++];
        }
        newArray[i]=element;
        return newArray;
    }

    // create a method that adds new element to an Array
    // method accept String Array, and String variable, and will return a new String Array with the string  variable added to the array

}
