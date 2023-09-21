package largestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int index = 1; index < strs.length; index++) {
            String current = strs[index];
            int minLen = Math.min(current.length(), result.length());
            int endIndex = 0;
            while (endIndex < minLen && current.charAt(endIndex) == result.charAt(endIndex)) {
                endIndex++;
            }
            result = result.substring(0, endIndex);
        }
        return result;
    }
}
