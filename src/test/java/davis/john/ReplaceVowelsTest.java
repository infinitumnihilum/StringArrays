package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class ReplaceVowelsTest {
ReplaceVowels replaceVowels;

    @Before
    public void setUp() throws Exception {
replaceVowels = new ReplaceVowels();
    }

    @Test
    public void testPrintReplaceVowels() throws Exception {
        String example = "I never saw a purple cow";
        String expected = "* n*v*r s*w * p*rpl* c*w";
        String actual = replaceVowels.printReplaceVowels(example);
        assertEquals("Fails if vowels are not replaced", expected, actual);
        System.out.println("Test Passed");
    }
}