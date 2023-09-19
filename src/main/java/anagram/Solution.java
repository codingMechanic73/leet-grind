package anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[127];
        for (char c: s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c: t.toCharArray()) {
            int remaining = count[c - 'a'];
            if (remaining == 0) {
                return false;
            } else {
                count[c - 'a']--;
            }
        }
        return true;
    }
}
