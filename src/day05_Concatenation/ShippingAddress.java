package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        /*  Create a class called ShippingAddress.java
        2. Declare the following variables:
        1. name
        2. buildingNumber
        3. streetName
        4. city
        5. state
        6. zipCode
        3. Use concatenation to print the full address

        James Boe
        1123p Jones Branch Dr
        McLean, VA 22155

        */
        String name = "James Boe" ,
                buildingNumber = "1123p" ,
                streetName = "Jones Branch Dr" ,
                city = "McLean",
                state = "VA",
                zipCode = "221554";

        String address = name +"\n"+buildingNumber +" "+ streetName + "\n" + city +", " + state + " " + zipCode;

        System.out.println(address);





    }

}
