package day47_Polymorphism_GeneralReview;

import day38_Inheritance_Overridding.carTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

        for (Car each: cars){

            if (each instanceof Toyota){
                if (each.year>=2010 && each.year<=2011){
                    System.out.println(each);
                }
            }
            if (each instanceof BMW){
                    System.out.println(each);
            }
            if (each instanceof Tesla){
                if (each.year>=2015 && each.year<=2016){
                    System.out.println(each);
                }
            }
        }

        System.out.println("--------------------------------------------");
        //1.3 Write a program that can display the car that has the highest mileage

        Car carWithHighestMilleage=cars[0];
        Car carWithLowestMilleage=cars[0];

        for (Car each : cars) {
            if (each.miles>carWithHighestMilleage.miles){
                carWithHighestMilleage=each;
            }

            if (each.miles<carWithLowestMilleage.miles){
                carWithLowestMilleage=each;
            }
        }
        System.out.println(carWithHighestMilleage);
        System.out.println(carWithLowestMilleage);




    }

}
/*
1 Given the following array that contains the car objects:


		        (import them from day38 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest mileage

			1.3 Write a program that can display the car that has the lowest mileage


 */