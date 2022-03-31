package week11;

public class TV {

    public String name;
    public int channel=1;  // default channel is 1
    public int volumeLevel=1; // default volume will be 1
    public boolean on=false; // tv is off

    public TV(){
        // Constructor with no parameter
    }

    public void turnOn(){
        on=true;
    }

    public void turnOff(){
        on=false;
    }

    public void setChannel(int newChannel){
        if(on&&newChannel>=1&&newChannel<=120){
            channel=newChannel;  //  channel is instance variable, newChannel is local variable
        }
    }

    public void setVolume(int newVolume){
        if(on && newVolume>=1 && newVolume<=7){
            volumeLevel=newVolume;
        }
    }

    public void channelUp(){
        if (on && channel<120){
            channel++;
        }
    }

    public void channelDown(){
        if (on && channel>1){
            channel--;
        }
    }

    public void volumeUp(){
        if (on && volumeLevel<7){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if (on && volumeLevel>1){
            volumeLevel--;
        }
    }

    public String toString() {
        return "TV " +
                "\n\tchannel=" + channel +
                ", \n\tvolumeLevel=" + volumeLevel +
                ", \n\ton=" + on;

    }
}
