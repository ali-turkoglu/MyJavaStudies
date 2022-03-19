package day25_CustomMethods_Overloading.tasks;

public class MaxNumber {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,};
        System.out.println(max(arr1));

        byte[] arr2={1,5,6,1,0,44,33,7};
        System.out.println(max(arr2));
        
        float[] arr3={122.5f,22.6f,554.8f,1.9f};
        System.out.println(max(arr3));

    }

    public static int max(int[] array){

        int max=array[0];
        for (int each : array) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static byte max(byte[] array){

        byte max=array[0];
        for (byte each : array) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static float max(float[] array){

        float max=array[0];
        for (float each : array) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }

}
