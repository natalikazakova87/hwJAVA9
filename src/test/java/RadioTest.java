import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio radio = new Radio();
        radio.setToMaxRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio radio = new Radio();
        radio.setToMinRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAbove9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.reduceRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.reduceRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(50);
        int expected = 50;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolumeRadio() {
        Radio radio = new Radio();
        radio.setToMaxVolumeRadio();
        int expected = 100;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolumeRadio() {
        Radio radio = new Radio();
        radio.setToMinVolumeRadio();
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeRadioAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(120);
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeRadioBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(-10);
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(50);
        radio.increaseVolumeRadio();
        int expected = 51;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }    @Test
    public void shouldIncreaseVolumeRadioMax(){
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(100);
        radio.increaseVolumeRadio();
        int expected = 100;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(40);
        radio.reduceVolumeRadio();
        int expected = 39;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeRadioMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeRadio(0);
        radio.reduceVolumeRadio();
        int expected = 0;
        int actual = radio.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }
}