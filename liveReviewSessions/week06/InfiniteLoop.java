package week06;

public class InfiniteLoop {
    public static void main(String[] args) {
        int z=0;
        for (int i = 0; i <100 ; z++) {// condition is not related to iteration
            System.out.println("z: "+z);
        }
    }
}
