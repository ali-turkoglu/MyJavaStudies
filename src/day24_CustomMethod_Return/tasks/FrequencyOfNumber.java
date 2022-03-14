package day24_CustomMethod_Return.tasks;

public class FrequencyOfNumber {

    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};

        int number=1;
        int frequencyOfNumber=frequencyOfNumber(array,number);
        System.out.println("frequencyOfNumber = " + frequencyOfNumber);
    }

    public static int frequencyOfNumber(int[] arr,int number){

        int count=0;
        for (int each : arr) {
            if (each==number){
                count++;
            }
        }
        return count;
    }
}

/*
create method that accepts one integer array and one integer number and returns the frequency of the number


                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */

