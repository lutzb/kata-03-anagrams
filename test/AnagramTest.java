import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest {

    private Anagram anagram;

    @Before
    public void setup() {
         this.anagram = new Anagram();
    }

    @Test
    public void whenAnagramIsPassedTheSameStringItReturnsTrue() {
        assertEquals(true, anagram.isAnagram("s", "s"));
    }

    @Test
    public void whenAnagramIsPassedTwoStringsOfDifferentSizesItReturnsFalse() {
        assertEquals(false, anagram.isAnagram("ab", "abc"));
    }

    @Test
    public void whenAnagramIsPassedTwoStringsThatAreAnagramsItReturnsTrue() {
        assertEquals(true, anagram.isAnagram("abcde", "cbeda"));
    }

    @Test
    public void whenAnagramIsPassedTwoStringsThatAreAnagramsWithDuplicateCharactersItReturnsTrue() {
        assertEquals(true, anagram.isAnagram("abcdeefg", "ebacdefg"));
    }
}
