package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Jimmy", "Aaron", "Shay", "Ahmet"));
        System.out.println(employees);

        // remove all employees except Ahmet and David
        employees.retainAll(Arrays.asList("David", "Ahmet"));
        System.out.println("employees = " + employees);

        System.out.println("----------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        System.out.println(Arrays.toString(names));

        // remove every names starts with M
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        nameList.removeIf(p -> p.charAt(0) == 'M');
        names = nameList.toArray(new String[0]);
        System.out.println("Names without starting M : " + Arrays.toString(names));
    }
}
