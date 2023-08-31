package ru.netology.radio;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int sizeStation) {
        this.maxStation = minStation + sizeStation - 1;
    }

    public Radio() {
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void getNextStation() {
        int newCurrentStation = currentStation + 1;
        if (newCurrentStation < maxStation) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation >= maxStation) {
            currentStation = minStation;
        }
    }

    public void getPrevStation() {
        int newCurrentStation = currentStation - 1;
        if (newCurrentStation > minStation) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation <= minStation) {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        if (newCurrentVolume <= maxVolume) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        if (newCurrentVolume >= minVolume) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }
}