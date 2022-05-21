package week19;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<String > cities=new ArrayDeque<>();  // FIFO first in first out

        cities.addAll(Arrays.asList("Ankara","Athens","Washington","Paris"));

        System.out.println("cities = " + cities);
        cities.poll();
        System.out.println("cities = " + cities);
        cities.add("Brussels");
        System.out.println(cities.peek());


    }
}
