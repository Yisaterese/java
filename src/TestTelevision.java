import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTelevision {

    @Test
    public void testTelevisionIsOff_televisionIsOff() {
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertTrue(tv.toggleSwitch());
    }


    @Test
    public void testTelevisionIsOn_televisionIsOn() {
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());

    }

    @Test
    public void testTelevisionCanAddVolume_televisionCanAddVolume() {
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());
        assertEquals(2,tv.addVolume(2));

    }
        @Test
        public void testTelevisionCanReduceVolume_televisionCanReduceVolume() {
            Television tv = new Television();
            assertFalse(tv.isPoweredOn());
            tv.isOn();
            assertTrue(tv.isPoweredOn());
            tv.isOff();
            assertFalse(tv.isPoweredOn());
            assertTrue(tv.toggleSwitch());
            assertEquals(4,tv.addVolume(4));
            assertEquals(1, tv.reduceVolume(3));


        }

    @Test
    public void testTelevisionCanNotReduceVolumeBelow1_televisionCanNotReduceVolumeBelow1() {
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());
        assertEquals(4,tv.addVolume(4));
        assertEquals(1, tv.reduceVolume(3));



    }

    @Test
    public void testTelevisionCanUnsubscribeChannel_televisionCanUnsubscribeChannel(){
        Television tv = new Television();
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertTrue(tv.toggleSwitch());
        assertEquals(2,tv.addVolume(2));
        tv.subScribeChannels("Wazobia","Channels","Ait");
        assertEquals(3,tv.numberOfChannelsSubscribed());
        tv.unsubscribeChannels("Ait","Wazobia");
        assertEquals(1,tv.numberOfChannelsSubscribed());

    }
}
