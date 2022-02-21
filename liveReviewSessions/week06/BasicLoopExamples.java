package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {

        for (int i = 0; i <=1000 ; i+=10) {


            System.out.print(i+" ");

        }
        System.out.println("\n___________________________________________________");


        int z=0;
        for (;z<=1000;){
            if (z%10==0){
                System.out.print(z+" ");
            }

            z++;

        }

        System.out.println("\n___________________________________________");


        for (int i = 3; i <130 ; i+=2) {
            if (i!=129){
                System.out.print(i+" " );
            }

        }

        System.out.println("\n_________________________________________");


        int countOfEven=0;
        for (int i = 5; i <=50 ; i++) {

            if (i%2==0){
                ++countOfEven;
            }

        }

        System.out.println(countOfEven);

        System.out.println("\n____________________________________________________");


        for (int i = 1; i <=10 ; i++) {
            int j=12*i;
            System.out.println("12*"+i+"*="+j);

        }

    }


}
/* Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000


 */