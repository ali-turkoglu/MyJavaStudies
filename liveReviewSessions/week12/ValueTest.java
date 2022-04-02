package week12;

import java.util.Arrays;

public class ValueTest {

    public static void main(String[] args) {

        Value value=new Value();
        System.out.println(value.calledMethod);
        System.out.println(value.parameter);

        value.setValue(5);
        System.out.println(value.calledMethod);
        System.out.println(value.parameter);


        value.getValue();
        System.out.println(value.getValue());
        System.out.println(value.parameter);




    }
}
