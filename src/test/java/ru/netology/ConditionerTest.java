package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldDoEarlyExit() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(10);
        conditioner.setCurrentTemperature(111);
        assertEquals(0, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldincreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(6);
        conditioner.increaseCurrentTemperature();
        assertEquals(7, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldNotincreaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(-10);
        conditioner.setMinTemperature(-20);
        conditioner.setCurrentTemperature(100);
        conditioner.increaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotincreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(5);
        conditioner.setMinTemperature(2);
        conditioner.setCurrentTemperature(0);
        conditioner.increaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotincreaseCurrentTemperatureEqualMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(5);
        conditioner.setMinTemperature(2);
        conditioner.setCurrentTemperature(5);
        conditioner.increaseCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }

    @Test
    public void shoulddecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(10);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(2);
        conditioner.decreaseCurrentTemperature();
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotdecreaseCurrentTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(4);
        conditioner.setMinTemperature(2);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotdecreaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(-1);
        conditioner.setMinTemperature(-100);
        conditioner.setCurrentTemperature(100);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotdecreaseCurrentTemperatureEqualMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(5);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}


