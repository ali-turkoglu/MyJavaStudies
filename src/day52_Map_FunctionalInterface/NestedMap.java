package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {

        Map<Integer,String > map1=new LinkedHashMap<>(); // employee Id & jobTitle
        map1.put(11, "SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Developer");
        map1.put(15, "PO");

        Map<String ,Integer> map2=new LinkedHashMap<>(); // employee name & salary
        map2.put("Shay", 100000);
        map2.put("Hulya", 110000);
        map2.put("Veronica", 115000);
        map2.put("Ali", 150000);
        map2.put("Alex", 160000);

        Map<Map<Integer,String >,Map<String ,Integer>> mapOfMap=new LinkedHashMap<>();
        mapOfMap.put(map1,map2);

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) {
            for (Map.Entry<Integer, String> map1Entry : mapMapEntry.getKey().entrySet()) {
                System.out.println("JobTitle = " + map1Entry.getValue());
            }

            for (Map.Entry<String, Integer> map2entry : mapMapEntry.getValue().entrySet()) {
                System.out.println("Name = " + map2entry.getKey());
            }

        }

        System.out.println("Veronica's salary: "+mapOfMap.get(map1).get("Veronica"));


    }
}
