package ru.netology.radiotest;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import ru.netology.radio.Radio;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void getMinStation() {
        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxStation() {
        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinVolume() {
        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxVolume() {
        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewSizeStation() {
        Radio radio = new Radio(16);

        int expected = 15;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation() {
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewStationUpperLimit() {
        radio.setCurrentStation(12);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewStationUnderLimit() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextStationUpperLimit() {
        radio.setCurrentStation(9);
        radio.getNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextStation() {
        radio.setCurrentStation(6);
        radio.getNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrevStationUnderLimit() {
        radio.setCurrentStation(0);
        radio.getPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrevStation() {
        radio.setCurrentStation(6);
        radio.getPrevStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getVolume() {
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolumeUpperLimit() {
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolumeUnderLimit() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimit() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderLimit() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}