package groupanagram;

import java.util.*;
public class Solution {

    /**
     * Time Complexity: n*kLogk (sorting kLogk for n elements)
     * Space Complexity: n*kLogk
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            map.computeIfAbsent(String.valueOf(ch), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    /**
     * Time Complexity: O(n*k)
     * Space Complexity: O(n*k)
     */
    public List<List<String>> groupAnagramsOptimized(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] ch = str.toCharArray();
            int[] key = new int[26];

            for (char c: ch) {
                key[c - 'a']++;
            }

            map.computeIfAbsent(Arrays.toString(key), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
