package day30_CustomClass_Intro;

import java.util.ArrayList;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee worker1 = new Employee();
        worker1.setInfo("Smith", 233, 'M', "Customer Service", 45555, true);

        Employee worker2 = new Employee();
        worker2.setInfo("Dilara", 322, 'F', "Sales", 35555, false);

        Employee worker3 = new Employee();
        worker3.setInfo("Shane", 534, 'F', "Sales", 43333, true);

        Employee worker4 = new Employee();
        worker4.setInfo("John", 894, 'M', "Customer Service", 54444, false);

        Employee worker5 = new Employee();
        worker5.setInfo("Harold", 873, 'M', "Sales", 39888, false);

        Employee[] employees = {worker1, worker2, worker3, worker4, worker5};

        for (Employee each : employees) {
            System.out.println(each);
        }

        int countFullTime = 0;
        double minSalary = employees[0].salary;
        double maxSalary = employees[0].salary;

        ArrayList<Employee> fullTime = new ArrayList<>();
        for (Employee each : employees) {
            if (each.isFullTime == true) {
                countFullTime++;
                fullTime.add(each);
            }
            if (each.salary > maxSalary) {
                maxSalary = each.salary;
            }
            if (each.salary < minSalary) {
                minSalary = each.salary;
            }
        }
        System.out.println("employees = " + employees);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("fullTime = " + fullTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);


    }
}
/*
CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */