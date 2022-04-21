package week11;

public class TV {
    // data fields+attributes

    int channel= 1;
    int volumeLevel=1;
    boolean on= false;// tv is off

    public TV() {
        //Constructor with No parameters
    }
    public void trunOn() {
        on = true;// on value will turn to true
    }
    public void turnoff() {
        on = false;
    }

    public void setChannel(int newChannel){
        if(on && newChannel>=1 && newChannel<=120 ){
            channel=newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {
            volumeLevel = newVolume;
        }
    }
    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }
        public void volumeUp() {
            if (on && volumeLevel < 7) {
                volumeLevel++;
            }
        }
            public void volumeDown() {
                if (on && volumeLevel > 1) {
                    volumeLevel--;
                }
            }

    public String toString() {
        return "TV" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                " }"
                ;
    }
}


