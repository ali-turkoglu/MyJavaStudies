package day20_Arrays;

public class FindingMinOfArray {
    public static void main(String[] args) {
        int [] numbers={23,54,34,22,9,8};
        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            min=(numbers[i]<min)?numbers[i]:numbers[0];
         /*   if (numbers[i]<min){
                min=numbers[i];
            }*/
        }
        System.out.println(min);
    }
}
