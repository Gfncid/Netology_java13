package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldincreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(9);
        conditioner.increaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldincreaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(1200);
        conditioner.increaseCurrentTemperature();
        assertEquals(9, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldincreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(3);
        conditioner.setCurrentTemperature(2);
        conditioner.increaseCurrentTemperature();
        assertEquals(3, conditioner.getCurrentTemperature());
    }

    @Test
    public void shoulddecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(9);
        conditioner.decreaseCurrentTemperature();
        assertEquals(8, conditioner.getCurrentTemperature());
    }
    @Test
    public void shoulddecreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(-10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shoulddecreaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(11);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }
}

