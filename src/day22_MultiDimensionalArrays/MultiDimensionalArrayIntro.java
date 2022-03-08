package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String [] group1={"Joh","Johnes","James"};
        String [] group2={"Aaron","Shar","Brenda"};
        String [] group3={"Cassandra","Tahir","Brenda"};


        String [][] groups=new String[3][];
        groups[1]=group1;
        groups[0]=group2;
        groups[2]=group3;
        //System.out.println(Arrays.toString());--------->is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------------------------------------------------------------");

//index of the elements:  0 1 2   0 1 2 3   0 1 2  3   4
          int[][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
   //index of arrays:       0        1           2

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("-------------------------------------------------------------------------");

        System.out.println(Arrays.toString(groups[1])); //  [Joh, Johnes, James]
        System.out.println(Arrays.toString(arr2D[1]));  //  [4, 5, 6, 7]
        System.out.println(arr2D[2][4]);                //  12


    }
}
