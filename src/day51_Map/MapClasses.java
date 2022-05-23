package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

           // Key   Value
        Map<Integer,String> hashMap= new HashMap<>(); 
        // random order, fast, key can not be duplicated, accept null
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Ahmet");
        hashMap.put(5,"Ahmet");
        hashMap.put(5,"Isabella");
        hashMap.put(6,"Ahmet");
        hashMap.put(7,"Ahmet");
        hashMap.put(null,null);
        hashMap.put(null,null);
        hashMap.put(null,"Emre");
        hashMap.put(null,"Ali");
        hashMap.put(8,null);
        hashMap.put(11,null);

        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.get(5) = " + hashMap.get(5)); // get is key value


        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        //  insertion order, Accepts null value as a key
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Emre");
        linkedHashMap.put(null,"Ali");
        linkedHashMap.put(8,null);
        linkedHashMap.put(11,null);

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap= new TreeMap<>();
        //  sorted (Ascending) order, Does not accept null as a key
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabella");
        //treeMap.put(null,"Emre");  --> not accept null as a key
        //treeMap.put(null,"Ali");
        treeMap.put(8,null);
        treeMap.put(11,null);

        System.out.println("treeMap = " + treeMap);

        Map<Integer,String> hashtable= new Hashtable<>();
        // random order, Does not accept null as a key and value, Synchronized (Thread-Safe)
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabella");
        //hashtable.put(null,"Emre");  --> Does not accept null as a key and value
        //hashtable.put(null,"Ali");
        //hashtable.put(8,null);
        //hashtable.put(11,null);

        System.out.println("hashtable = " + hashtable);


    }
}
