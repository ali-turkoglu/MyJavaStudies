package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String [] myGroup=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        //System.out.println(myGroup);  ------------> hashcode

        System.out.println(Arrays.toString(myGroup));
        System.out.println(myGroup[4]);

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if(number<1||number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


        System.out.println("--------------------------------------------------");


        int[] years=new int[9];
        //years={"1","2","3","4","5","6","7","8","9"};

        System.out.println(Arrays.toString(years));

        double[] weight=new double[5];
        System.out.println(Arrays.toString(weight));

        boolean[] eligible=new boolean[5];
        System.out.println(Arrays.toString(eligible));



    }
}
