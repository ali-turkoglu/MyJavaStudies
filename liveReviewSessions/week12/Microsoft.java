package week12;

import java.util.Arrays;

public class Microsoft {

    public static void main(String[] args) {

        String[] arr = {"ab", "cd", "ef"};

        Employee employee1=new Employee();  // --> employee1 is a just a reference, not an object
        employee1.name="Emir";
        employee1.jobTitle="SDET";
        employee1.ID=4433;
        employee1.salary=77777;
        System.out.println(employee1);



        Employee[] testers = {new Employee("Yasin", "QA", 1243, 90000),
                new Employee("Ruby", "SDET", 34, 87000),
                new Employee("Kadir", "QA Lead", 45, 110000),
                new Employee("Dilek", "SDET", 456, 77000)};

        System.out.println(Arrays.toString(testers));


        double maxSalary = Double.MIN_VALUE;

        for (Employee each : testers) {
            // each a reference for our objects created inside the array


            // finding max salary

            if (each.salary > maxSalary) {
                maxSalary = each.salary;
            }


        }
        System.out.println(maxSalary);


    }
}
