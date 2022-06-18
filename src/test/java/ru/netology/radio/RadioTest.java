package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStationOneValueBelowMin() {
        Radio radio = new Radio(50);

        radio.setNumberOfCurrentRadioStation(-1);


        Assertions.assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    public void setStationMinNumber() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationOneValueAboveMin() {
        Radio radio = new Radio(11);

        radio.setNumberOfCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNumberInMid() {
        Radio radio = new Radio(599);

        radio.setNumberOfCurrentRadioStation(299);

        int expected = 299;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationOneValueBelowMax() {
        Radio radio = new Radio(9);

        radio.setNumberOfCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMaxNumber() {
        Radio radio = new Radio(34);

        radio.setNumberOfCurrentRadioStation(33);

        int expected = 33;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationOneValueAboveMax() {
        Radio radio = new Radio(99);

        radio.setNumberOfCurrentRadioStation(99);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void switchToNextStationIfCurrentInMid() {
        Radio radio = new Radio(11);
        radio.setNumberOfCurrentRadioStation(5);

        radio.switchToNextRadioStation();

        int expected = 6;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void switchFromMaxStationToMin() {
        Radio radio = new Radio(15);

        radio.setNumberOfCurrentRadioStation(14);
        radio.switchToNextRadioStation();

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPreviousStationIfCurrentInMid() {
        Radio radio = new Radio(13);

        radio.setNumberOfCurrentRadioStation(6);
        radio.switchToPreviousRadioStation();

        int expected = 5;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void switchFromMinStationToMax() {
        Radio radio = new Radio(10);

        radio.setNumberOfCurrentRadioStation(0);
        radio.switchToPreviousRadioStation();

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void lowerIfCurrentVolumeOneValueAboveMin() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(1);
        radio.lowerVolumeOfSound();

        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseIfCurrentVolumeOneValueBelowMax() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(99);
        radio.increaseVolumeOfSound();

        int expected = 100;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notTurnUpSoundIfCurrentVolumeIsMax() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(100);
        radio.increaseVolumeOfSound();

        int expected = 100;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notTurnUpSoundIfCurrentVolumeIsMin() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(0);
        radio.lowerVolumeOfSound();

        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpSoundAboveIfCurrentVolumeInMid() {
        Radio radio = new Radio();


        radio.setVolumeOfSound(50);
        radio.increaseVolumeOfSound();

        int expected = 51;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpSoundBelowIfCurrentVolumeInMid() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(50);
        radio.lowerVolumeOfSound();

        int expected = 49;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetSoundIfCurrentAboveMax() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(101);


        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetSoundIfCurrentAboveMin() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(-1);


        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

}
