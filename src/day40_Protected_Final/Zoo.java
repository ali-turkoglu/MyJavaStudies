package day40_Protected_Final;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog("Max","Husky",'M',"brown","large",3);

        System.out.println(dog.getBreed());
        System.out.println(dog.getName());
    }
}
