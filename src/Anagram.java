public class Anagram {

    public Anagram () { }

    public boolean isAnagram(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        return false;
    }
}
