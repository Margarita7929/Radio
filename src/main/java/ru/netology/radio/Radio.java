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

    public void switchToNextRadioStation(int currentStation) {
        if (currentStation == 9) {
            numberOfCurrentRadioStation = 0;

        } else {
            numberOfCurrentRadioStation = currentStation + 1;
        }

    }

    public void switchToPreviousRadioStation(int currentStation) {
        if (currentStation == 0) {
            numberOfCurrentRadioStation = 9;

        } else {
            numberOfCurrentRadioStation = currentStation - 1;
        }

    }

    public int getVolumeOfSound() {
        return volumeOfSound;
    }

    public void setVolumeOfSound(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 9) {
            return;
        }
        volumeOfSound = newVolume;
    }


    public void increaseVolumeOfSound(int currVolume) {
        if (currVolume == 10) {
            volumeOfSound = 10;

        } else {
            volumeOfSound = currVolume + 1;

        }
    }

    public void lowerVolumeOfSound(int currVolume) {
        if (currVolume == 0) {
            volumeOfSound = 0;

        } else {
            volumeOfSound = currVolume - 1;
        }
    }
}




