package tests;

public class T5_PassingCars {

    public int solution(int[] A){

        int east=0;
        int total=0;
        for (int each:A){
            if (each==0){
                east++;
            }else{
                total+=east;
            }
        }
        System.out.println(total);
        if (total>1000000000||total<-1000000000){
            return -1;
        }
        return total;
    }

    public static void main(String[] args) {
        T5_PassingCars passingCars=new T5_PassingCars();
        passingCars.solution(new int[]{0,1,0,1,1});

    }
}
