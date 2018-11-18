package me.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanTest {

    private Roman rmn;

    @BeforeEach
    public void init() {
        this.rmn = new Roman();
    }

    @Test
    void singleNumber() {

        Assertions.assertEquals(1, this.rmn.convert("I"));
        Assertions.assertEquals(5, this.rmn.convert("V"));
    }

    @Test
    void numberWithManyDigits() {

        Assertions.assertEquals(8, this.rmn.convert("VIII"));
    }

    @Test
    void numberWithSubtractiveNotation() {

        Assertions.assertEquals(4, this.rmn.convert("IV"));
    }

    @Test
    void numberWithAndWithoutSubtractiveNotation() {

        Assertions.assertEquals(44, this.rmn.convert("XLIV"));
    }
}
