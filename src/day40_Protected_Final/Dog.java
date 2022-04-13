package day40_Protected_Final;

public final class Dog extends Animal{

    public Dog(String name,String breed, char gender, String color, String size, int age) {
        super(name,breed, gender, color, size, age);
    }

    public  void eat(){
        System.out.println(getName()+" is eating dog food");
    }

    public  void eat(String food){
        System.out.println(getName()+" is eating "+food);
    }

    // public void drink(){   }  this method came from SuperClass and it is final. final can not be override

}

// class Cat extends Dog {} --> Dog class can not be Parent class. because it is final class
