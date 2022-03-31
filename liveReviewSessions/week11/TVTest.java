package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class TVTest {

    public static void main(String[] args) {

        TV samsung=new TV(); // new keyword envokes our constructor with no parameters

        System.out.println(samsung);

        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();// tv is off so volume is not up

        System.out.println(samsung);

        samsung.turnOn();
        samsung.setVolume(3);
        samsung.setChannel(66);
        System.out.println(samsung);

        samsung.turnOff();
        System.out.println(samsung);

        System.out.println("-----------------------------------------");

        TV LG=new TV();
        LG.turnOn();
        LG.volumeUp();
        LG.volumeUp();
        LG.volumeUp();
        LG.channelUp();
        LG.channelUp();
        LG.channelUp();
        LG.channelUp();
        LG.channelUp();
        LG.channelUp();
        LG.channelUp();
        System.out.println(LG);

        System.out.println("-------------------------------------------------");

        // ArrayList
        ArrayList<TV> tvlist=new ArrayList<>();
        tvlist.addAll(Arrays.asList(samsung,LG));


        for (TV each:tvlist){  // each : becomes object reference for our TV objects
            System.out.println("Is  TV on? "+ each.on);
        }

    }
}
