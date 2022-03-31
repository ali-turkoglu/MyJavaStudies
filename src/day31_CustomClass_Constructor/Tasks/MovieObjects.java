package day31_CustomClass_Constructor.Tasks;

public class MovieObjects {

    public static void main(String[] args) {

        Movie obj1=new Movie("USA","Journay to SDET: Cydeo Batch EU8","Thriller","23 June 2022","Kuzzat Altay");

        obj1.addCast("Asiya");
        String[] obj1Casts={"Adam","Muhtar","Oscar","Yasin","Smith"};

        obj1.addCasts(obj1Casts);

        System.out.println(obj1);

    }
}
/*2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie


 */