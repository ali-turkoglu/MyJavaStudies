package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        System.out.println(list);
        int num=1;
        list.remove(num);   // primitive olduğundan index numarasını dikkate alır
        System.out.println(list);

        Integer num2=200;  // non - primitive olduğundan object i dikkate alır
        list.remove(num2);

        // list.remove(200); hata verir, çünkü sayılar ilk int olarak kabul edilir ve 200 nolu index olmadığından hata verir.

        boolean r=list.remove(num2);
        System.out.println(r);

        System.out.println("------------------------------  clear  ----------------");

        list.clear();
        System.out.println(list.size());

        System.out.println("-------------------------------  indexOf -----------------------");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');

        int n1=characters.indexOf('A');  //0
        int n2=characters.lastIndexOf('A'); // 4
        System.out.println("indexOf: "+n1+"\nlastIndexOf: "+n2);
        System.out.println((n1==n2)?"Unique":"not unique");

        System.out.println("------------------------- contain  ---------------------------------");

        boolean r2=characters.contains('B'); // true

        System.out.println("-------------------------  equals  ------------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        list1.add(100);
        list1.add(200);
        list1.add(100);

        list2.add(100);
        list2.add(100);
        list2.add(200);

        boolean r3=list1.equals(list2); // it must be same order, same elements to be true
        System.out.println(r3);


        System.out.println("------------------------------  empty  -------------------------------");

        boolean r4=list.isEmpty();  // we clear before
        System.out.println(r4);

        System.out.println("-------------------------  addAll  ------------------------------------");

        ArrayList<Integer> numbers= new ArrayList<>();

        //Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println(numbers);
    }
}
