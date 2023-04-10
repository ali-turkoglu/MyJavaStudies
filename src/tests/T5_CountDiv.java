package tests;

public class T5_CountDiv {

    public int solution(int A,int B,int K){

        int counter=0;
        for(int i=A;i<=B;i++){
            if (i%K==0){
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }


    public static void main(String[] args) {
           T5_CountDiv countDiv=new T5_CountDiv();
           countDiv.solution(3,12,3);

    }
}
