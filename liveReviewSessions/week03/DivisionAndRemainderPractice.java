package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {
        //input is some amount of seconds (45000)
        //hours, minutes, seconds

        int inputSeconds = 45000;
        int hours,
                minutes,
                seconds;  //declared
        /*
        algorithm:
        1. 1 minute is 60 seconds, 1 hour 3600 seconds
        2. remainder operator to turn inputSeconds to find seconds
         */
        seconds = inputSeconds % 60;  //calculate remaning seconds
        minutes = (inputSeconds/60)%60;  //remaining minutes
        hours = inputSeconds / 3600;   //  howmany hours we have

        String clock = "Hours:" +hours+" Minutes:"+minutes+" Seconds:";
        System.out.println("clock = " + clock);
    }
}
