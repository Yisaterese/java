import java.util.ArrayList;

public class Television {
    private boolean isOn;
    private int volume;
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

    public void addVolume(int vol) {
        for(int counter = 1; counter <= vol; counter++){
            boolean addedVolumeRange = vol >= 1;
            if(addedVolumeRange) {
                volume++;
            }else{

            }
        }

    }

    public void reduceVolume(int reducedVolume){
        for(int count  = reducedVolume; count >= 1;  count-- ) {
            boolean reducedVolumeRange = reducedVolume < 16;
            if(reducedVolumeRange){
                volume--;
            }else{

            }
        }
    }

    public int getCurrentVolume(){
        return volume;
    }


    public void subScribeChannels(String... inputChannel){
        for(int index = 0; index < inputChannel.length; index++) {
            channels.add(inputChannel[index]);
        }
    }

    public void unsubscribeChannels(String... channelName){
        for(int index = 0; index < channels.size()-1; index++) {
            if(channels.get(index).equals(channelName[index])){
                channels.remove(channelName);
            }
        }
    }
    public int numberOfChannelsSubscribed(){
        return channels.size();
   }
}
