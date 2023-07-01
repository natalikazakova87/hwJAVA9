import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {


    @Test
    public void shouldSetVolumeRadio(){
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(50);
        int expected=50;
        int actual=radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolumeRadio(){
        Radio radio = new Radio();
        radio.setToMaxVolumeRadio();
        int expected = 100;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinVolumeRadio(){
        Radio radio = new Radio();
        radio.setToMinVolumeRadio();
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeRadioAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(120);
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeRadioBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(-10);
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeRadio(){
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(50);
        radio.increaseVolumeRadio();
        int expected = 51;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolumeRadio(){
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(41);
        radio.reduceVolumeRadio();
        int expected = 40;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
}


