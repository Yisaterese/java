import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTelevision {
    private Television tv;

    @BeforeEach
    public void setUp() {
        tv = new Television();
        tv.defaultVolume();
    }
   @AfterEach
    public void tearDown(){
        tv = null;
    }
    @Test
    public void testTelevisionIsOff_televisionIsOff() {

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
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());
        assertEquals(0,tv.getCurrentVolume());
        tv.addVolume(17);
        assertEquals(16,tv.getCurrentVolume());
    }

        @Test
        public void testTelevisionCanReduceVolume_televisionCanReduceVolume() {
            assertFalse(tv.isPoweredOn());
            tv.isOn();
            assertTrue(tv.isPoweredOn());
            tv.isOff();
            assertFalse(tv.isPoweredOn());
            assertTrue(tv.toggleSwitch());
            tv.addVolume(4);
            assertEquals(4,tv.getCurrentVolume());
            tv.reduceVolume(3);
            assertEquals(1,tv.getCurrentVolume());
        }

    @Test
    public void testTelevisionCanNotReduceVolumeBelow1_televisionCanNotReduceVolumeBelow1() {
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());
        tv.addVolume(4);
        assertEquals(4,tv.getCurrentVolume());
        tv.reduceVolume(3);
        assertEquals(1,tv.getCurrentVolume());
        tv.reduceVolume(-3);
        assertEquals(1,tv.getCurrentVolume());
        tv.defaultVolume();
        assertEquals(0,tv.getCurrentVolume());
    }

    @Test
    public void testTelevisionCanNotAddVolumeAbove16_televisionCanNotAddVolumeAbove16() {
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertFalse(tv.isPoweredOn());
        assertTrue(tv.toggleSwitch());
        tv.addVolume(4);
        assertEquals(4,tv.getCurrentVolume());
        tv.reduceVolume(3);
        assertEquals(1,tv.getCurrentVolume());
        tv.addVolume(16);
        assertEquals(16,tv.getCurrentVolume());
        tv.defaultVolume();
        assertEquals(0,tv.getCurrentVolume());

    }

    @Test
    public void testTelevisionCanUnsubscribeChannel_televisionCanUnsubscribeChannel(){
        assertFalse(tv.isPoweredOn());
        tv.isOn();
        assertTrue(tv.isPoweredOn());
        tv.isOff();
        assertTrue(tv.toggleSwitch());
        tv.addVolume(2);
        assertEquals(2,tv.getCurrentVolume());
        tv.reduceVolume(1);
        assertEquals(1,tv.getCurrentVolume());
        tv.subScribeChannels("Wazobia","Channels","Ait");
        assertEquals(3,tv.numberOfChannelsSubscribed());
        tv.unsubscribeChannels("Ait","Wazobia");
        assertEquals(1,tv.numberOfChannelsSubscribed());

    }
}
