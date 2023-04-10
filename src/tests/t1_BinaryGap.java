package tests;

public class t1_BinaryGap {


    public int solution(int N) {
        String binaryString = Integer.toString(N, 2);

        int count = 0;
        int max = 0;
        boolean second1 = false;

//        for (int i = 0; i < binaryString.length(); i++) {
//            String str = binaryString.substring(i, i + 1);
//
//            if (str.equals("1")) {
//                if (second1) {
//                    if (count > max) {
//                        max = count;
//                    }
//                }
//                count = 0;
//                second1 = true;
//            }
//            if (str.equals("0")) {
//                count++;
//            }
//        }

        String binaryStr=Integer.toString(N,2);

        for(int i=0; i<binaryStr.length();i++){
            char ch=binaryStr.charAt(i);

            if(ch =='1'){
                if(second1){
                    if(count>max){
                        max=count;
                    }
                }
                count=0;
                second1=true;
            }
            if(ch=='0'){
                count++;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        t1_BinaryGap bg = new t1_BinaryGap();
        System.out.println(bg.solution(9));
    }


}
