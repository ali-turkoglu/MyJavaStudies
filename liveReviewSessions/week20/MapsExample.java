package week20;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {

        Map<String,Object> empOne = new LinkedHashMap<>();
        empOne.put("First_Name","Steven");
        empOne.put("Last_Name","King");
        empOne.put("Job_ID","AD_PRES");
        empOne.put("Salary",24000);
        empOne.put("Deparment_ID",90);
        System.out.println("empOne = " + empOne);

        Map<String , Object> empTwo = new LinkedHashMap<>();


    }
}
