package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String,Integer> students=new HashMap<>();

        students.put("Aygun",95);
        students.put("Maria",89);
        students.put("Serkan",98);
        students.put("Alex",87);
        students.put("Ali",90);

        // keySet --> Set list of keys

        Set<String> keys=students.keySet();
        System.out.println(keys);  // [Alex, Aygun, Maria, Serkan, Ali]

        /*for (String eachkey : keys) {
            System.out.println(eachkey+" \t: "+students.get(eachkey));
            students.replace(eachkey,students.get(eachkey)+5);
        }

        for (String eachkey : keys) {
            System.out.println(eachkey+" \t: "+students.get(eachkey));

        }*/

        for (String eachkey : students.keySet()) {
            Integer eachValue=students.get(eachkey);
            if (eachValue<90){
                System.out.println(eachkey+" : "+eachValue);
            }
        }

        //===========================================================

        Map<String ,Integer> earlyBirds=new HashMap<>();
        Map<String ,Integer> angryBirds=new HashMap<>();

        for (String eachkey : students.keySet()) {
            Integer eachValue=students.get(eachkey);
            if (eachValue>=90){
                earlyBirds.put(eachkey,eachValue);
            }else {
                angryBirds.put(eachkey,eachValue);
            }

        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("----------------------------------------------------------------");


        // values
        Collection<Integer> scores = students.values();
        List<Integer> scores2=new ArrayList<>(students.values());  // now it has index no


        System.out.println(scores);
        System.out.println(scores2);

        for (Integer eachValue : students.values()) {
            System.out.println(eachValue);
        }

        System.out.println("---------------------------------------------------------------");


        int maxScore=Integer.MIN_VALUE;

        for (Integer eachValue : students.values()) {
            if (eachValue>maxScore){
                maxScore=eachValue;
            }
        }
        System.out.println("maxScore = " + maxScore);

        int minScore=Integer.MAX_VALUE;
        for (Integer eachValue : students.values()) {
            if (eachValue<minScore){
                minScore=eachValue;
            }
        }
        System.out.println("minScore = " + minScore);

        System.out.println("-------------------------------------------------------------");

        int max=Collections.max(students.values());
        int min=Collections.min(students.values());
        System.out.println(max);
        System.out.println(min);

        System.out.println("----------------------------------------------------------");

        // how many students has the score of 95 or greater
        int count=0;
        for (Integer eachScore : students.values()) {

            if(eachScore>=95){
                count++;
            }
        }
        System.out.println("number of  95 or greater scores: "+count);

        System.out.println("----------------------------------------------------------");

        // entrySet --> key + value both are entry

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey()+" : "+ entry.getValue());

        }

    }


}
