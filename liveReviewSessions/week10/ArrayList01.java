package week10;

import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {

        // to show autoboxing
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            // how can I out primitives into Arraylist with the help of autoboxing
            list.add(i);
        }
    }
}
