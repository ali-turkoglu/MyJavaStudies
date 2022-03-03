package day20_Arrays.tasks;

public class PriceTag {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

// 1.task
        System.out.println(items[2].charAt(0));

// 2.task
        for (String each : items) {
            if(each.equals("iPad")){
                System.out.println(each);

// 3.task

                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]+" \t- "+itemIDs[i]+" \t- $"+prices[i]);
                }
            }
        }
    }
}
   /* Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
        name - price - #ID*/