package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddElementToArrayList {

    public static void main(String[] args) {

        ArrayList<String> browsersList=new ArrayList<>();
        browsersList.addAll(Arrays.asList("chrome","edge","opera","firefox"));

        System.out.println(browsersList); // [chrome, edge, opera, firefox]

        System.out.println(browsersList.size());  // 4

        browsersList.add("explorer");  // [chrome, edge, opera, firefox, explorer]

        System.out.println(browsersList);

        System.out.println(browsersList.get(1));  // edge -->  index element of 1

        Collections.sort(browsersList);  // [chrome, edge, explorer, firefox, opera]

        System.out.println(browsersList);


    }


}
