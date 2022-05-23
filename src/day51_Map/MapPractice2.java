package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //    1 who has the maximum and minimum salary?
        int max=Integer.MIN_VALUE;
        String nameOfmax="";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue()>max){
                max=entry.getValue();
                nameOfmax=entry.getKey();
            }
        }
        System.out.println("nameOfmax = " + nameOfmax);


        //    1.2 who has the minimum salary?
        int min=Integer.MAX_VALUE;
        String nameOfMin="";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<min){
                min=entry.getValue();
                nameOfMin=entry.getKey();
            }
        }
        System.out.println("nameOfMin = " + nameOfMin);


        //    1.3 how many employees has the salary between 120k ~ 150K?
        int count=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<=150000 && entry.getValue()>=120000){
                count++;
            }
        }
        System.out.println("count of  employees has the salary between 120k ~ 150K= " + count);


        //    1.4 display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<=118000){
                System.out.println(entry.getKey());
            }
        }


        //    1.5 increase the salary of each employee by 10K
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue()+10000);
        }
        System.out.println(map);

    }
}
