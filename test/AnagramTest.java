import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void whenAnagramIsPassedTheSameStringItReturnsTrue() {
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram("s", "s");
        assertEquals(true, result);
    }

    @Test
    public void whenAnagramIsPassedTwoStringsOfDifferentSizesItReturnsFalse() {
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram("ab", "abc");
        assertEquals(false, result);
    }
}
