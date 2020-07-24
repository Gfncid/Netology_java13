package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldincreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(3);
        radio.increaseVolume();
        assertEquals(4, radio.getVolume());
    }

    @Test
    public void shouldNotincreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(-1);
        radio.setMinVolume(-10);
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldNotincreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(3);
        radio.setVolume(-123);
        radio.increaseVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    public void shoulddecreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(2);
        radio.decreaseVolume();
        assertEquals(1, radio.getVolume());

    }

    @Test
    public void shouldNotdecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(1);
        radio.setVolume(-12);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());

    }

    @Test
    public void shouldNotdecreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(-1);
        radio.setMinVolume(-2);
        radio.setVolume(11);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());

    }

    @Test
    public void shouldChangeToNextStation() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setStation(7);
        radio.nextStation();
        assertEquals(8, radio.getStation());
    }

    @Test
    public void shouldChangeToFirstStationAfterLast() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setStation(9);
        radio.nextStation();
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldReturn() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setStation(-3);
        radio.nextStation();
        assertEquals(-3, radio.getStation());
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setStation(5);
        radio.prevStation();
        assertEquals(4, radio.getStation());
    }

    @Test
    public void shouldChangeToLastStationBeforeFirst() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setStation(0);
        radio.prevStation();
        assertEquals(9, radio.getStation());
    }

    @Test
    public void shouldReturn2() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setStation(15);
        radio.prevStation();
        assertEquals(15, radio.getStation());
    }

}