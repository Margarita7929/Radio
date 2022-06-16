package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStationOneValueBelowMin() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
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
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNumberInMid() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationOneValueBelowMax() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMaxNumber() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationOneValueAboveMax() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void switchToNextStationIfCurrentInMid() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadioStation(5);

        radio.switchToNextRadioStation();

        int expected = 6;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void switchFromMaxStationToMin() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(9);
        radio.switchToNextRadioStation();

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPreviousStationIfCurrentInMid() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(6);
        radio.switchToPreviousRadioStation();

        int expected = 5;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void switchFromMinStationToMax() {
        Radio radio = new Radio();

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

        radio.setVolumeOfSound(9);
        radio.increaseVolumeOfSound();

        int expected = 10;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notTurnUpSoundIfCurrentVolumeIsMax() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(10);
        radio.increaseVolumeOfSound();

        int expected = 10;
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


        radio.setVolumeOfSound(5);
        radio.increaseVolumeOfSound();

        int expected = 6;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpSoundBelowIfCurrentVolumeInMid() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(5);
        radio.lowerVolumeOfSound();

        int expected = 4;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetSoundIfCurrentAboveMax() {
        Radio radio = new Radio();

        radio.setVolumeOfSound(11);


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
