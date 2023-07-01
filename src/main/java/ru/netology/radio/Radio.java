package ru.netology.radio;
public class Radio {
    public int currentVolumeRadio;
    public int getCurrentVolumeRadio(){
        return currentVolumeRadio;
    }
    public void setCurrentVolumeRadio(int newCurrentVolumeRadio){
        if(newCurrentVolumeRadio<0){
            return;
        }
        if(newCurrentVolumeRadio>100){
            return;
        }
        currentVolumeRadio=newCurrentVolumeRadio;
    }
    public void setToMaxVolumeRadio(){
        currentVolumeRadio=100;
    }
    public void setToMinVolumeRadio(){
        currentVolumeRadio=0;
    }
    public void increaseVolumeRadio(){
        if(currentVolumeRadio<=100){
            currentVolumeRadio++;
        }
    }
    public void reduceVolumeRadio(){
        if(currentVolumeRadio<=100){
            currentVolumeRadio--;
        }
    }
}
