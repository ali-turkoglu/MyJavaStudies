package tests;

public class T8_Dominator {

    public int solution(int[] A){

        int maxNumberIndex=0;
        int maxCount=0;

        for (int i = 0; i < A.length; i++) {
            int count=0;
            for (int j=0;j<A.length;j++){
                if (A[i]==A[j]){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                maxNumberIndex=i;
            }
        }

        return (maxCount>A.length/2)? maxNumberIndex:-1;
    }

    public static void main(String[] args) {
        T8_Dominator dominator=new T8_Dominator();
        System.out.println(dominator.solution(new int[]{5,4,3,2,3,-1,3,3,3}));
    }
}
