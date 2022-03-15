package day26_CustomMethods_Practice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] numbers={1,1,1,2,2,3,3,3,3,1,1,5,6,7,9};
        int frequencyNumber=frequencyOfElement(numbers,1);
        System.out.println(frequencyNumber);

        String[] names={"ali","ali","veli"};
        System.out.println(frequencyOfElement(names,"ali"));


    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int [] array,int element ){

        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double [] array,double element ){

        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char [] array,char element ){

        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String [] array,String element ){

        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

}
