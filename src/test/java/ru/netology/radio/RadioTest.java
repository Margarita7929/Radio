package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioStationNumberOneValueBelowMinimum() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationMinimumNumber() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberOneValueAboveMinimum() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberInMiddle() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberOneValueBelowMaximum() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationMaximumNumber() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberOneValueAboveMaximum() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSwitchToNextRadioStationIfCurrentInMiddle() {
        Radio radio = new Radio();

        radio.switchToNextRadioStation(5);

        int expected = 6;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ifCurrentStationIsMaximumWhenSwitchToNextShouldSetMinimumStation() {
        Radio radio = new Radio();

        radio.switchToNextRadioStation(9);

        int expected = 0;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousRadioStationIfCurrentInMiddle() {
        Radio radio = new Radio();

        radio.switchToPreviousRadioStation(6);

        int expected = 5;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ifCurrentStationIsMinimumWhenSwitchToPrevShouldSetMaximumStation() {
        Radio radio = new Radio();

        radio.switchToPreviousRadioStation(0);

        int expected = 9;
        int actual = radio.getNumberOfCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldLowerSoundIfCurrentVolumeOneValueAboveMinimum() {
        Radio radio = new Radio();

        radio.lowerVolumeOfSound(1);

        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundIfCurrentVolumeOneValueBelowMaximum() {
        Radio radio = new Radio();

        radio.increaseVolumeOfSound(9);

        int expected = 10;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpSoundIfCurrentVolumeIsMaximum() {
        Radio radio = new Radio();

        radio.increaseVolumeOfSound(10);
        int expected = 10;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpSoundIfCurrentVolumeIsMinimum() {
        Radio radio = new Radio();

        radio.lowerVolumeOfSound(0);
        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpSoundAboveIfCurrentVolumeInMiddle() {
        Radio radio = new Radio();

        radio.increaseVolumeOfSound(5);
        int expected = 6;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpSoundBelowIfCurrentVolumeInMiddle() {
        Radio radio = new Radio();

        radio.lowerVolumeOfSound(5);
        int expected = 4;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }
}
