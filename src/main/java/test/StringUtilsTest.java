package test;

import org.junit.Assert;
import org.junit.Test;
import fr.diginamic.utils.StringUtils;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistance_nominalCases() {
        assertEquals(0, StringUtils.levenshteinDistance("", ""));
        assertEquals(0, StringUtils.levenshteinDistance("abc", "abc"));
        assertEquals(1, StringUtils.levenshteinDistance("abc", "abd"));
        assertEquals(1, StringUtils.levenshteinDistance("abc", "ab"));
        assertEquals(1, StringUtils.levenshteinDistance("abc", "abcd"));
        assertEquals(1, StringUtils.levenshteinDistance("abc", "axc"));
        assertEquals(1, StringUtils.levenshteinDistance("abc", "abx"));
        assertEquals(3, StringUtils.levenshteinDistance("abc", "xyz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinDistance_robustness() {
        StringUtils.levenshteinDistance(null, "");
    }
}
