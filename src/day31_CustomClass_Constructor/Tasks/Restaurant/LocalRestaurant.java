package day31_CustomClass_Constructor.Tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1=new Restaurant("Mehmet","Mersin",4);

        Server[] serverArray={
                new Server("Ahmet",11,20,true),
                new Server("Ozan",13,15,true),
                new Server("Yakup",15,35,true)};

        Chef[] chefsArray={
                new Chef("Sabryne",23,54,false),
                new Chef("Habib",26,35,true)};



       //restaurant1.servers=new ArrayList<>();   --> Restaurant Class da Contructor da tanımlandığı için buna gerek yok

        restaurant1.servers.addAll(Arrays.asList(serverArray));

        restaurant1.hireChefs(chefsArray);

        System.out.println(restaurant1);

        restaurant1.terminateServer(15);
        System.out.println(restaurant1);
        System.out.println();



    }
}
/* Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */