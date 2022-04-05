package day37_Inharitance_SuperKeyword.animalTask;

public class Cat extends Animal{

    public String a;

    public Cat(String a,String name, String breed, char gender, int age, String size, String color){
        super(name,breed,gender,age,size,color);
        this.a=a;
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
