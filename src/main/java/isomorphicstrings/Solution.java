package isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * TimeComplexity O(n)
     * SpaceComplexity O(2n)
     */
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            char sChar = s.charAt(index);
            char tChar = t.charAt(index);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}
