package day32_CustomClass_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1=new Employee("Aaron");
        System.out.println("employee1 = " + employee1);

        Employee employee2=new Employee("Sharan","QA");
        System.out.println("employee2 = " + employee2);

        Employee employee3=new Employee("Olga","SDET",'F');
        System.out.println("employee3 = " + employee3);

        Employee employee4=new Employee("Ahmet","QA",'M',80000);
        System.out.println("employee4 = " + employee4);


    }
}
