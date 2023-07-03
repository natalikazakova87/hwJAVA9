package ru.netology.radio;
public class Radio {
    private int currentRadioStation;
    private int currentVolumeRadio;

    public void increaseRadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation >= 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
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
            currentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
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
        currentRadioStation = 9;
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
