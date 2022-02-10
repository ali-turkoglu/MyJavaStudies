package week04;

public class NestedIfExample {
    public static void main(String[] args) {

        boolean isRushHour=false;
        int carType=2;
        double price=0;

        if(carType==1){
            if (isRushHour){
                price=30;
            }else{
                price=5;
            }

        }else if (carType==2){
            if (isRushHour){
                price=55;
            }else{
                price=10;
            }

        }else {

        }

    }
}
