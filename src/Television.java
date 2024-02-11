import java.util.ArrayList;

public class Television {
    private boolean isOn;
    private int volume = 16;
    private ArrayList <String> channels = new ArrayList<>();


    public void  isOn(){
        isOn = true;
    }
    public boolean isPoweredOn(){
        return isOn;
    }

    public void isOff(){
        isOn = false;
    }
    public boolean toggleSwitch(){
        isOn = !isOn;
        return isOn;
    }
    public void defaultVolume(){
        this.volume = 0;
    }
    public void addVolume(int addVol) {
        for(int counter = 1; counter <= addVol; counter++){
            volume++;
            }
        if(volume  > 16) {
            volume = 16;
        }
            // }else{
            //    break;
        //}

    }

    public void reduceVolume(int reducedVolume){
        for(int count  = reducedVolume; count >= 1;  count-- ) {
           volume--;
        }
    }

    public int getCurrentVolume(){
        return volume;
    }

    public void subScribeChannels(String... inputChannel){
        for(int index = 0; index < inputChannel.length; index++)
            channels.add(inputChannel[index]);

    }

    public void unsubscribeChannels(String... channelName){
        for(int index = 0; index < channelName.length; index++) {
            if(channels.contains(channelName[index])) {
                channels.remove(channelName[index]);
            }
        }
    }
    public int numberOfChannelsSubscribed(){
        return channels.size();
    }
}
