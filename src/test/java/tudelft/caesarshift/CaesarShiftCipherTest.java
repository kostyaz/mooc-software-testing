package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest()
    @CsvSource({"A,1,invalid", "ab,0,ab", "ab,1,bc", "ab,-1,za", "ab,26,ab", "ab,-26,ab", "a b,1,b c", "yz,2,ab"})
    public void doTest(String message, int shift, String result) {

        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals(result, cipher.CaesarShiftCipher(message, shift));
    }
}
