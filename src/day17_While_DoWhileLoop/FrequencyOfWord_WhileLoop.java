package day17_While_DoWhileLoop;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str="Cat Cat cat Dog Dog cAt";
        int frequence=0;

        while (str.contains("cat")){
         str=str.toLowerCase().replaceFirst("cat","")   ;
            frequence++;
        }
        System.out.println(frequence);

        System.out.println("__________________________________________________");

        System.out.println("----------------------------------------");

        String s = "java java java python python python";

        int countJava =0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
