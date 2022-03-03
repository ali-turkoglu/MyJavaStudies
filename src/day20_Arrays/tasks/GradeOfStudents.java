package day20_Arrays.tasks;

public class GradeOfStudents {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        int i=0;

        for (int each : scores) {
            if (each>89 && each<=100){
                grades[i]='A';
            }else if (each>79 && each<90){
                grades[i]='B';
            }else if (each>69 && each<80){
                grades[i]='C';
            }else if (each>59 && each<70){
                grades[i]='D';
            }else{
                grades[i]='F';
            }
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
            i++;
        }



    }
}
/* given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A



 */