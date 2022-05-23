package day51_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {

    public static void main(String[] args) {

        // student name & score
        Map<String,Integer> students=new HashMap<>();

        System.out.println("students = " + students); // students = {}
        System.out.println("students.size() = " + students.size()); // students.size() = 0

        students.put("Aygun",85);
        students.put("Maria",89);
        students.put("Serkan",78);
        students.put("Alex",87);
        students.put("Ali",90);
        students.put("Ali",85);
        students.put("Ali",75); // --> key aynı olduğu için listede en son girilen olur

        System.out.println("students = " + students); // students = {Alex=87, Aygun=85, Maria=89, Serkan=78, Ali=75}

        System.out.println("students.size() = " + students.size()); // students.size() = 5

        // display the score of Alex
        System.out.println("students.get(\"Alex\") = " + students.get("Alex")); // students.get("Alex") = 87

        // replace Ali's score to 90
        students.replace("Ali",90);
        System.out.println("students.get(\"Ali\") = " + students.get("Ali")); //students.get("Ali") = 90

        // remove method
        students.remove("Alex");
        System.out.println("students.size() = " + students.size());  // students.size() = 4

        // containKey - containValue
        boolean r1=students.containsKey("Muhtar");
        boolean r2=students.containsKey("Maria");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // isEmpty

        System.out.println("students.isEmpty() = " + students.isEmpty());

        System.out.println("-----------------------------------------------------------------------");

        // Equals

        Map<String ,Integer> map1=new HashMap<>();
        map1.putAll(students);

        Map<String ,Integer> map2=new HashMap<>();
        map2.putAll(students);

        System.out.println(map1.equals(map2)); // true
        System.out.println(map1==map2);   // false


        // clear --> everything will be removed
        map1.clear();

        // =========================================================================================


        // keyset --> return an Set <> list of keys
        Set<String> keys=students.keySet();
        System.out.println(keys);

        // values
        Collection<Integer> scores = students.values();

        System.out.println(scores);


        // entrySet --> key + value both are entry
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey()+" : "+ entry.getValue());

        }


    }
}
