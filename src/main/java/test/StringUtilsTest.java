package test;

import static org.junit.Assert.assertEquals;
import fr.diginamic.utils.StringUtils;

import org.junit.Test;

public class StringUtilsTest{

    @Test
    public void testLevenshteinDistance_nominalCases() {
        assertEquals(1, StringUtils.levenshteinDistance("Chine", "Chien"));
        assertEquals(1, StringUtils.levenshteinDistance("Vienne", "Sienne"));
        assertEquals(0, StringUtils.levenshteinDistance("", ""));
        assertEquals(0, StringUtils.levenshteinDistance("Hello", "Hello"));
        assertEquals(6, StringUtils.levenshteinDistance("World", ""));
        assertEquals(3, StringUtils.levenshteinDistance("Saturday", "Sunday"));
    }

    @Test
    public void testLevenshteinDistance_robustness() {
        assertEquals(0, StringUtils.levenshteinDistance(null, null));
        assertEquals(5, StringUtils.levenshteinDistance(null, "Hello"));
        assertEquals(5, StringUtils.levenshteinDistance("Hello", null));
    }
}
