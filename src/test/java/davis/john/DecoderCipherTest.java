package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class DecoderCipherTest {
DecoderCipher decoderCipher;
    @Before
    public void setUp() throws Exception {
    decoderCipher = new DecoderCipher();
    }

    @Test
    public void testCipherDecoder() throws Exception {
     String example = "9 14,5,22,5,18 19,1,23 1 16,21,18,16,12,5 3,15,23";
     String expected = "i never saw a purple cow";
     String actual = decoderCipher.cipherDecoder(example);
     assertEquals("Test fails if fails to produce sentance for the numbers", expected, actual);
        System.out.println("Test Passed");
    }
}