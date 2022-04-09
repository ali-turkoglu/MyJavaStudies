package day35_OPP_Encapsulation.tasks;

public class ItemObjects {

    public static void main(String[] args) {

        Item makarna=new Item("makarna",7.5,3);
        System.out.println(makarna);


        makarna.setName("2makarna");
        makarna.setName("makarn@");
        makarna.setName("makarna3");
        System.out.println(makarna);


        Item tk=new Item("toilet paper",70,1);
        System.out.println(tk.getQuantity());

    }
}
