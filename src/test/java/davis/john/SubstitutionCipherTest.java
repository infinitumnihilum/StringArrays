package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class SubstitutionCipherTest {
SubstitutionCipher substitutionCipher;
    @Before
    public void setUp() throws Exception {
substitutionCipher = new SubstitutionCipher();
    }

    @Test
    public void testPrintCipher() throws Exception {
    String example = "Hello World";
    String expected = "8,5,12,12,15 23,15,18,12,4";
    String actual = substitutionCipher.printCipher(example);
    assertEquals("Test fails if incorrect or no numbers are displayed", expected, actual);
        System.out.println("Test Passed");
    }
}