package ru.netology.radio;

public class Radio {
    int currentVolume;
    int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void getNextStation() {
        int newCurrentStation = currentStation + 1;
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation >= 9) {
            currentStation = 0;
        }
    }

    public void getPrevStation() {
        int newCurrentStation = currentStation - 1;
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation <= 0) {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        if (newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        if (newCurrentVolume >= 0) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        }
    }
}