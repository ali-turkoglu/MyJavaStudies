package day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.color="white";
        dog1.size="Small";

        System.out.println("dog1 = "+dog1.toString());

        Dog dog2=new Dog();

        dog2.name="Lassie";
        dog2.breed="GermanWolf";
        dog2.age=5;
        dog2.gender='F';
        dog2.color="Brown";
        dog2.size="Large";

        System.out.println("dog2 = " + dog2.toString());

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Medium","Brown");

        System.out.println("dog3 = " + dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4=new Dog();
        Dog dog5=new Dog();

        dog4.setInfo("Fino","Kanish",3,'F',"Small","White");
        dog5.setInfo("Bullet","Labrador",5,'M',"Large","Yellow");

        Dog[] dogs={dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog> dogLists=new ArrayList<>();
        dogLists.addAll(Arrays.asList(dogs));

        ArrayList<Dog> femaleDogs=new ArrayList<>();
        ArrayList<Dog> maleDogs=new ArrayList<>();

        for (Dog each : dogLists) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }else{
                maleDogs.add(each);
            }
        }

        System.out.println(Arrays.toString(dogs));
        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);


    }
}
