package ru.netology;

import org.junit.jupiter.api.Disabled;
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
    public void shouldNotincreaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(1200);
        conditioner.increaseCurrentTemperature();
        assertEquals(1200, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotincreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(9);
        conditioner.setMinTemperature(3);
        conditioner.setCurrentTemperature(2);
        conditioner.increaseCurrentTemperature();
        assertEquals(2, conditioner.getCurrentTemperature());
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
    public void shouldNotdecreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(-10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-10, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotdecreaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(11);
        conditioner.decreaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }
}

