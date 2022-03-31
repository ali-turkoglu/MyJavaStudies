package day31_CustomClass_Constructor.Tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner,Location;
    public int numberOfStars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
        servers=new ArrayList<>();
        chefs=new ArrayList<>();
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p->p.employeeID==employeeID);
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Servers size=" + servers.size() +
                ", Chefs size=" + chefs.size() +
                '}';
    }
}
/*Restaurant Task:

		6.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information



 */