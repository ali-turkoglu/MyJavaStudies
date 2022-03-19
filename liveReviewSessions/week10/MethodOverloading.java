package week10;

public class MethodOverloading {

    public static void main(String[] args) {


        System.out.println(convertBritishToMetric(5,11.0));
        System.out.println(convertBritishToMetric(-5,11.0));
    }
    // I will as parameter either inches or inches and feet together----> return value in centimeters

    public static double convertBritishToMetric(double feet, double inches){
        // 1 feet = 12 inches
        if (feet<0||inches<0||inches>12){
            System.err.println("Invalid feet or inches");
            System.exit(-1);
            //return -1.0; //
        }
        return feet*12*2.54+inches*2.54;
    }

    public static double convertBritishToMetric(double inches){

        if (inches<0){
            System.err.println("Invalid feet or inches");
            return -1.0;
        }
        return inches*2.54;
    }


}
