package ru.netology.radio;
public class Radio {
    private int currentRadioStation;
    private int currentVolumeRadio;
    private int maxStation;

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public void increaseRadioStation() {
        if (currentRadioStation <= maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation >= 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void increaseVolumeRadio() {
        if (currentVolumeRadio < 100) {
            currentVolumeRadio++;
        } else {
            currentVolumeRadio = 100;
        }
    }

    public void reduceVolumeRadio() {
        if (currentVolumeRadio > 0) {
            currentVolumeRadio--;
        } else {
            currentVolumeRadio = 0;
        }
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = maxStation;
        }
        if (newCurrentRadioStation > maxStation) {
            currentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolumeRadio() {
        return currentVolumeRadio;
    }

    public void setCurrentVolumeRadio(int newCurrentVolumeRadio) {
        if (newCurrentVolumeRadio < 0) {
            return;
        }
        if (newCurrentVolumeRadio > 100) {
            return;
        }
        currentVolumeRadio = newCurrentVolumeRadio;
    }


    public void setToMaxRadioStation() {
        currentRadioStation = maxStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setToMaxVolumeRadio() {
        currentVolumeRadio = 100;
    }

    public void setToMinVolumeRadio() {
        currentVolumeRadio = 0;
    }


}
