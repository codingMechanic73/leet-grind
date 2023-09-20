package concatarray;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] newArr = new int[len * 2];
        for (int i = 0; i < len; i++) {
            newArr[i] = nums[i];
            newArr[i + len] = nums[i];
        }
        return newArr;
    }
}
