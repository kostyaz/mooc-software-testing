package me.leap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapTest {

    private Leap leap;

    @BeforeEach
    public void init() {
        this.leap = new Leap();
    }

    @Test
    void by4Not100() {

        Assertions.assertEquals(true, leap.isLeapYear(2016));
    }

    @Test
    void by4And100Not400() {

        Assertions.assertEquals(false, leap.isLeapYear(1900));
    }

    @Test
    void by4And400() {

        Assertions.assertEquals(true, leap.isLeapYear(2000));
    }

    @Test
    void notBy4() {

        Assertions.assertEquals(false, leap.isLeapYear(2015));
    }
}
