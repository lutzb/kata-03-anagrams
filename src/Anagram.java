import java.util.Arrays;

public class Anagram {

    public Anagram () { }

    public boolean isAnagram(String s1, String s2) {
        char[] s1Arry = s1.toCharArray();
        char[] s2Arry = s2.toCharArray();

        Arrays.sort(s1Arry);
        Arrays.sort(s2Arry);

        return Arrays.equals(s1Arry, s2Arry);
    }
}
