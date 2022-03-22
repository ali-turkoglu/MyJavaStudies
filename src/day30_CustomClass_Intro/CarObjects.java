package day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1=new Car();

        car1.setInfo("BMW","X5","Black",2012,3500);

        System.out.println(car1);

        System.out.println("-------------------------------------------");

        Car car2=new Car();

        car2.setInfo("Toyota","Corolla","White",2020,15000);

        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Audi","Q5","Red",2021,55000);

        Car[] cars={car1,car2,car3};

        ArrayList<Car> carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        System.out.println(carList);

        for (Car each:carList){
            System.out.println(each.brand+" : "+each.price);
        }

        System.out.println("--------------------------------");

        //BMW: 2005-2008
        // Toyota: 1995~1997

        carList.removeIf(p->p.brand.equals("BMW")&&p.year>=2005&&p.year<=1997);

    }
}
