package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void noChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("", mi.mirrorEnds(""));
    }

    @Test
    public void oneChar() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("a", mi.mirrorEnds("a"));
    }

    @Test
    public void twoChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("", mi.mirrorEnds("ab"));
    }

    @Test
    public void fewChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("ab", mi.mirrorEnds("abba"));
    }

    @Test
    public void evenMoreChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("a", mi.mirrorEnds("abca"));
    }

    @Test
    public void oddChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("aba", mi.mirrorEnds("aba"));
    }

    @Test
    public void strangeChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("ab", mi.mirrorEnds("abcdba"));
    }

    @Test
    public void wowChars() {

        Mirror mi = new Mirror();

        Assertions.assertEquals("ab", mi.mirrorEnds("abcdeba"));
    }
}
