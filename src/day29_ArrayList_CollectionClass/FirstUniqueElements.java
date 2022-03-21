package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 3, 3, 5, 6, 6));

        System.out.println(list);

        for (Integer each : list) {
            int count = 0;
            for (Integer element : list) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
                break;
            }
        }
    }
}
