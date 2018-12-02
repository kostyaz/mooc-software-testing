package tudelft.sum;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoNumbersSumTest {

    private TwoNumbersSum sum;

    @BeforeEach
    public void init() {
        this.sum = new TwoNumbersSum();
    }

    @Test
    public void zeros() {

        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(0)),
                this.sum.addTwoNumbers(new ArrayList<Integer>(Arrays.asList(0)), new ArrayList<Integer>(Arrays.asList(0))));
    }

    @Test
    public void zeroAndNonZero() {

        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(1)),
                this.sum.addTwoNumbers(new ArrayList<Integer>(Arrays.asList(0)), new ArrayList<Integer>(Arrays.asList(1))));
    }

    @Test
    public void nonZeros() {

        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(8)),
                this.sum.addTwoNumbers(new ArrayList<Integer>(Arrays.asList(3)), new ArrayList<Integer>(Arrays.asList(5))));
    }

    @Test
    public void bigNumbers() {

        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(1,5,8)),
                this.sum.addTwoNumbers(new ArrayList<Integer>(Arrays.asList(7,9)), new ArrayList<Integer>(Arrays.asList(7,9))));
    }
}
