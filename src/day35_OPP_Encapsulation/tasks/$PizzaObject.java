package day35_OPP_Encapsulation.tasks;

public class $PizzaObject {

    public static void main(String[] args) {

        Pizza p1=new Pizza("small",2,3);
        System.out.println(p1);
        p1.calcCost();

        Pizza p2=new Pizza("medium",3,3);
        System.out.println(p2);

        Pizza p3=new Pizza("large",3,3);
        System.out.println(p3);


        p3.setSize("XXL");
        System.out.println(p3);

        Pizza p4=new Pizza("XXL", 2,2);
        System.out.println(p4);

    }
}
