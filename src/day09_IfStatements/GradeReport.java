package day09_IfElse_MultiBrach;

public class GradeReport {
    public static void main(String[] args) {
        int score = 9;
        char grade= '-';

        if (score>89 && score<=100){
            grade='A';
        }else if (score>79 && score<90){
            grade='B';
        }else if (score>69 && score<80){
            grade='C';
        }else if (score>59 && score<70){
            grade='D';
        }else{
            grade='F';
        }
        System.out.println("Score is : "+score+"\nGrade is : "+ grade);

    }
}
