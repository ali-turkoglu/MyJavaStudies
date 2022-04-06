package day37_Inharitance_SuperKeyword.animalTask;

public class Cat extends Animal{

    public String scratch;

    public Cat(String scratch,String name, String breed, char gender, int age, String size, String color){
        super(name,breed,gender,age,size,color);
        this.scratch=scratch;
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
