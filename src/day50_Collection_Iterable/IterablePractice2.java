package day50_Collection_Iterable;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {


        List<String > names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet","ahMet","Daniel","Ahmet","John","Naim","Ahmet","Shay"));

        //remove all the names ahmet
        names.removeIf(each->each.equalsIgnoreCase("ahmet"));

        System.out.println(names);

        System.out.println("------------------------------------------------------");

        List<String > names2=new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmet","ahMet","Daniel","Ahmet","John","Naim","Ahmet","Shay"));

      Iterator<String > it=names2.iterator();

      while (it.hasNext()){
          if (it.next().equalsIgnoreCase("ahmet")){
              it.remove();
          }
      }
      System.out.println(names2);

        System.out.println("--------------------------------------------------------");

        List<String > names3=new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmet","ahMet","Daniel","Ahmet","John","Naim","Ahmet","Shay"));

        for (Iterator<String> it3=names3.iterator(); it3.hasNext();){
            if (it3.next().equalsIgnoreCase("ahmet")){
                it3.remove();
            }
        }
        System.out.println(names3);



    }
}
