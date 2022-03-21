package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        gradeOfA.removeIf(p->p<90|| p>100);
        System.out.println("grade Of A = " + gradeOfA);
        System.out.println("Total number of A: "+gradeOfA.size());


        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p-> p<80||p>=90);
        System.out.println("grade Of B = " + gradeOfB);
        System.out.println("Total number of B: "+gradeOfB.size());

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p->p<70||p>=80);
        System.out.println("grade Of C = " + gradeOfC);
        System.out.println("Total number of C: "+gradeOfC.size());

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p->p<60||p>=70);
        System.out.println("grade Of D = " + gradeOfD);
        System.out.println("Total number of D: "+gradeOfD.size());

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeIf(p->p<0||p>=60);
        System.out.println("grade Of F = " + gradeOfF);
        System.out.println("Total number of F: "+gradeOfF.size());

        gradeOfF.removeAll(gradeOfA); // veya bu şekilde de grade F ortaya çıkarılabilir.
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);





    }
}
