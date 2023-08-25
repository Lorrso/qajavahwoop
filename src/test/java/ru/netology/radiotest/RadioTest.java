package ru.netology.radiotest;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void getStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewStationUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(12);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewStationUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextStationUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int newCurrentStation = radio.getCurrentStation() + 1;
        radio.getNextStation(newCurrentStation);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int newCurrentStation = radio.getCurrentStation() + 1;
        radio.getNextStation(newCurrentStation);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrevStationUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int newCurrentStation = radio.getCurrentStation() - 1;
        radio.getPrevStation(newCurrentStation);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int newCurrentStation = radio.getCurrentStation() - 1;
        radio.getPrevStation(newCurrentStation);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolumeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        int newCurrentVolume = radio.getCurrentVolume() + 1;
        radio.increaseVolume(newCurrentVolume);

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        int newCurrentVolume = radio.getCurrentVolume() + 1;
        radio.increaseVolume(newCurrentVolume);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        int newCurrentVolume = radio.getCurrentVolume() - 1;
        radio.decreaseVolume(newCurrentVolume);

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int newCurrentVolume = radio.getCurrentVolume() - 1;
        radio.decreaseVolume(newCurrentVolume);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}