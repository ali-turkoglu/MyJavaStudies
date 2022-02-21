package day17_While_DoWhileLoop;

public class FrequenceOfWord2 {
    public static void main(String[] args) {
        String str="Cat Cat cat Dog Dog cAt";
        String eachSub="";
        int frequence=0;

        for (int i = 0; i < str.length()-2; i++) {
            eachSub=str.substring(i,i+3);
            System.out.println(eachSub);

            if (eachSub.equalsIgnoreCase("Cat")){
                frequence++;
            }
        }

        System.out.println(frequence);


    }
}
