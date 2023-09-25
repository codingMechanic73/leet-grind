package mergestringalternatively;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        char[] res = new char[len1 + len2];

        int i = 0;
        int k = 0;
        while(i < len1 && i < len2) {
            res[k++] = word1.charAt(i);
            res[k++] = word2.charAt(i);
            i++;
        }
        while(i < len1) {
            res[k++] = word1.charAt(i);
            i++;
        }
        while(i < len2) {
            res[k++] = word2.charAt(i);
            i++;
        }

        return String.valueOf(res);
    }
}
