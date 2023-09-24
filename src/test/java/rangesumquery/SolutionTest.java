package rangesumquery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findRangeSum() {
        Solution solution = new Solution(new int[]{-2, 0, 3, -5, 2, -1});
        Assertions.assertEquals(1, solution.sumRange(0, 2));
        Assertions.assertEquals(-1, solution.sumRange(2, 5));
        Assertions.assertEquals(-3, solution.sumRange(0, 5));
    }

}