package week10;

public class HighScore {

    public static void main(String[] args) {

        displayHighScorePosition("Smith",1);

        displayHighScorePosition("John",calculationHighScorePosition(600));

        int x=calculationHighScorePosition(600);
        displayHighScorePosition("John",x);


    }

    public static void displayHighScorePosition(String name, int position){

        System.out.println(name+" managed to get into position "+ position+ " on the high score table");

    }

    public static int calculationHighScorePosition(int playerScore){

        if (playerScore>=1000){
            return 1;
        }else if(playerScore>=500&&playerScore<1000){
            return 2;
        }else if (playerScore>=100 &&playerScore<500){
            return 3;
        }else{
            return 4;
        }

    }


}
