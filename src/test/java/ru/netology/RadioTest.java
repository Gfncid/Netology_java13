package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldincreaseVolume() {
        Radio radio = new Radio(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void shouldNotincreaseVolumeOverMax() {
        Radio radio = new Radio(110030);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void shouldNotincreaseVolumeUnderMin() {
        Radio radio = new Radio(-123);
        radio.increaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldNotincreaseVolumeEqualMax() {
        Radio radio = new Radio(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void shoulddecreaseVolume() {
        Radio radio = new Radio(44);
        radio.decreaseVolume();
        assertEquals(43, radio.getVolume());

    }

    @Test
    public void shouldNotdecreaseVolumeUnderMin() {
        Radio radio = new Radio(-100);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());

    }

    @Test
    public void shouldNotdecreaseVolumeOverMax() {
        Radio radio = new Radio(13314);
        radio.decreaseVolume();
        assertEquals(100, radio.getVolume());

    }

    @Test
    public void shouldNotdecreaseVolumeEqualMin() {
        Radio radio = new Radio(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());

    }









    @Test
    public void shouldChangeToNextStation() {
        Radio radio = new Radio(6, 10);
        radio.nextStation();
        assertEquals(7, radio.getStation());
    }

    @Test
    public void shouldChangeToFirstStationAfterLast() {
        Radio radio = new Radio(9, 9);
        radio.nextStation();
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldNotCanDoStationUnderMin() {
        Radio radio = new Radio(-13, 11);
        radio.nextStation();
        assertEquals(0, radio.getStation());
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radio radio = new Radio(4,10);
        radio.prevStation();
        assertEquals(3, radio.getStation());
    }

    @Test
    public void shouldChangeToLastStationBeforeFirst() {
        Radio radio = new Radio(0,11);
        radio.prevStation();
        assertEquals(11, radio.getStation());
    }

    @Test
    public void shouldNotCanDoStationOverMax() {
        Radio radio = new Radio(33, 13);
        radio.prevStation();
        assertEquals(13, radio.getStation());
    }

}