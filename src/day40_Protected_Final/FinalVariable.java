package day40_Protected_Final;

public class FinalVariable {

    final  char gender='M';

    final String birthDay;

    public FinalVariable(String birthDay){
        this.birthDay=birthDay;
    }



    public static void main(String[] args) {

        final double pi=3.14;

        // pi=2.2;  --> final varibales can not be reassigned

        final String name;

        name="Java";

        // name="Python";   --> final varibales can not be reassigned

        FinalVariable test=new FinalVariable("March 1");

        System.out.println(test);

        // test.birthDay="March 2";  --> we can not reassigned final variables
    }

}
