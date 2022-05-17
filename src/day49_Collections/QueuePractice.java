package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue: "+priorityQueue); // random order

        Queue<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("-----------------------------------------------------");

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        System.out.println("---------------------------------------------------------");

        System.out.println("2. data of linkedQueue = " + new LinkedList<>(linkedList).get(2)); // new assign
        System.out.println("2. data of linkedQueue = " + ((List)linkedList).get(2));    // polymorphism
        System.out.println("2. data of linkedQueue = " + ((LinkedList)linkedList).get(2));    // polymorphism


    }
}
