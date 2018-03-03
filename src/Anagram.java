public class Anagram {

    public Anagram () { }

    public boolean isAnagram(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                char s1Char = s1.charAt(i);

                boolean charExistsInS2 = false;
                for (int j = 0; j < s2.length(); j++) {
                    char s2Char = s2.charAt(j);

                    if (s1Char == s2Char) {
                        charExistsInS2 = true;
                    }
                }

                if (!charExistsInS2) {
                    return false;
                }
            }
        }

        return true;
    }
}
