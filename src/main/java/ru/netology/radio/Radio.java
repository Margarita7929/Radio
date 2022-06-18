package ru.netology.radio;

public class Radio {
    public int numberOfCurrentRadioStation;
    public int volumeOfSound;
    public int sumOfRadioStations;
    public int numberOfMaxStation = sumOfRadioStations - 1;


    public Radio(int sumOfRadioStations) {
        this.sumOfRadioStations = sumOfRadioStations;
        this.numberOfMaxStation = sumOfRadioStations - 1;
    }

    public Radio() {
        sumOfRadioStations = 10;
    }

    public int getNumberOfCurrentRadioStation() {
        return numberOfCurrentRadioStation;
    }

    public void setNumberOfCurrentRadioStation(int newNumberOfCurrentRadioStation) {
        if (newNumberOfCurrentRadioStation < 0) {
            return;
        }
        if (newNumberOfCurrentRadioStation > numberOfMaxStation) {
            return;
        }
        numberOfCurrentRadioStation = newNumberOfCurrentRadioStation;
    }

    public void switchToNextRadioStation() {
        int newRadioStation;
        if (numberOfCurrentRadioStation < numberOfMaxStation) {
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
            newRadioStation = numberOfMaxStation;
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
        if (newVolumeOfSound > 100) {
            return;
        }
        volumeOfSound = newVolumeOfSound;
    }

    public void increaseVolumeOfSound() {
        int newVolume;
        if (volumeOfSound < 100) {
            newVolume = volumeOfSound + 1;
        } else {
            newVolume = 100;
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




