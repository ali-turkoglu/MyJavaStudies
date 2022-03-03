package day20_Arrays.tasks;

public class CommonElement {
    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};

        for (int each : arr1) {

            for (int i = 0; i < arr1.length; i++) {

                if (each==arr2[i]){
                    System.out.println(each);
                }
            }

        }



    }
}
/*Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

 */