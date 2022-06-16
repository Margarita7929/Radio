package ru.netology.radio;

public class Radio {
    private int numberOfCurrentRadioStation;
    private int volumeOfSound;

    public int getNumberOfCurrentRadioStation() {
        return numberOfCurrentRadioStation;
    }

    public void setNumberOfCurrentRadioStation(int newNumberOfCurrentRadioStation) {
        if (newNumberOfCurrentRadioStation < 0) {
            return;
        }
        if (newNumberOfCurrentRadioStation > 9) {
            return;
        }
        numberOfCurrentRadioStation = newNumberOfCurrentRadioStation;
    }

    public void switchToNextRadioStation() {
        int newRadioStation;
        if (numberOfCurrentRadioStation < 9) {
            newRadioStation = numberOfCurrentRadioStation + 1;
        } else {
            newRadioStation = 0;
        }
        setNumberOfCurrentRadioStation(newRadioStation);
    }


    public void switchToPreviousRadioStation() {
        int newRadioStation;
        if (numberOfCurrentRadioStation > 0) {
            newRadioStation = numberOfCurrentRadioStation - 1;
        } else {
            newRadioStation = 9;
        }
        setNumberOfCurrentRadioStation(newRadioStation);
    }


    public int getVolumeOfSound() {
        return volumeOfSound;
    }

    public void setVolumeOfSound(int newVolumeOfSound) {
        if (newVolumeOfSound < 0) {
            return;
        }
        if (newVolumeOfSound > 10) {
            return;
        }
        volumeOfSound = newVolumeOfSound;
    }

    public void increaseVolumeOfSound() {
        int newVolume;
        if (volumeOfSound < 10) {
            newVolume = volumeOfSound + 1;
        } else {
            newVolume = 10;
        }
        setVolumeOfSound(newVolume);
    }


    public void lowerVolumeOfSound() {
        int newVolume;
        if (volumeOfSound > 0) {
            newVolume = volumeOfSound - 1;
        } else {
            newVolume = 0;
        }
        setVolumeOfSound(newVolume);
    }
}




