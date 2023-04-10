package tests;

public class t3_FrogJump {


    public int solution(int x, int y, int d){

        int count=0;
        while (x<y){
            x=x+d;
            count++;
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {

        t3_FrogJump fg=new t3_FrogJump();
        fg.solution(10,85,30);
        fg.solution(10,10,30);

    }
}
