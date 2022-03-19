package day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods1 {

    public static void main(String[] args) {

        ArrayList<String > students=new ArrayList<>();

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(10); // index 0      automatically convert int to Integer
        numbers.add(20); // index 1
        numbers.add(30); // index 2
        numbers.add(40);

        System.out.println("numbers = " + numbers);
        numbers.add(1,15);
        System.out.println("numbers = " + numbers);

        System.out.println(numbers.size());
        int lastIndex=numbers.size()-1;

        int num=numbers.get(2);
        System.out.println(num); // 20

        System.out.println(numbers.get(3)); //30

        System.out.println("-------------------------- get -----------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------ set -------------------------------------------");

        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");

        System.out.println(list);

        System.out.println("-----------------------remove------------------------------------------");

        ArrayList<String> employees=new ArrayList<>();
        employees.add("Suat");
        employees.add("John");
        employees.add("Smith");
        employees.add("Suna");
        employees.add("Monica");
        employees.add("Monica");

        System.out.println(employees);
        employees.remove(0);        //removes the element at given index and elements shifts to the left
        System.out.println(employees);

        employees.remove("monica");  // removes the first object, case sensitive
        System.out.println(employees);







    }
}
