package rangesumquery;

public class Solution {

    private final int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
        for (int i = 1; i < this.nums.length; i++) {
            this.nums[i] = this.nums[i - 1] + this.nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return this.nums[right];
        }
        return this.nums[right] - this.nums[left - 1];
    }
}
