package designparking;

public class Solution {

    private final int[] spaces = new int[]{0, 0, 0, 0};

    public Solution(int big, int medium, int small) {
        spaces[1] = big;
        spaces[2] = medium;
        spaces[3] = small;
    }

    public boolean addCar(int carType) {
        return spaces[carType]-- > 0;
    }
}
