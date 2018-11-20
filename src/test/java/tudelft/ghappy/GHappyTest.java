package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy ghappy;

    @BeforeEach
    public void init() {

        this.ghappy = new GHappy();
    }

    @Test
    public void emptyString() {

        Assertions.assertEquals(true, this.ghappy.gHappy(""));
    }

    @Test
    public void oneCharNoG() {

        Assertions.assertEquals(true, this.ghappy.gHappy("a"));
    }

    @Test
    public void oneG() {

        Assertions.assertEquals(false, this.ghappy.gHappy("g"));
    }

    @Test
    public void twoGs() {

        Assertions.assertEquals(true, this.ghappy.gHappy("gg"));
    }

    @Test
    public void threeGs() {

        Assertions.assertEquals(false, this.ghappy.gHappy("xxggxxgxx"));
    }
}
