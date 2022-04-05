package day35_OPP_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee e1=new Employee();
        e1.setName("Emily");
        e1.setAge(15);  // 16~90 olmalı, hata verercek
        e1.setGender('e');

        System.out.println(e1);

        Employee e2=new Employee("Ahmet",'M',44,80000);

        System.out.println(e2);

        e2.setSalary(e2.getSalary()+15000); // mevcut maaşının 15bin artışı için
        System.out.println(e2);

    }
}
