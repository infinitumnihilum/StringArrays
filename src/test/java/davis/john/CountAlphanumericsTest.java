package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class CountAlphanumericsTest {
CountAlphanumerics countAlphanumerics;
    @Before
    public void setUp() throws Exception {
countAlphanumerics = new CountAlphanumerics();
    }

    @Test
    public void testCountAlphaNums() throws Exception {
        String exampleString =  "1984 by George Orwell.";
        String expected = "18";
        String actual = countAlphanumerics.countAlphaNums(exampleString);
        assertEquals("Fails if not counting only alphabet chars",expected, actual);
        System.out.println("Test Passed");


    }
}