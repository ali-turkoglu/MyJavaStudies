package day38_Inheritance_Overridding.shapeTask;

public class Shapes {

    private String name;


    public Shapes(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public static void main(String[] args) {

        Circle c1=new Circle(5);

        Square s1=new Square(5);

        Rectangular r1=new Rectangular(5,7);

        System.out.println("r1 = " + r1);
        System.out.println("s1 = " + s1);
        System.out.println("c1 = " + c1);
        
    }
}
