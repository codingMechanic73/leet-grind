package pivotindex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findPivotIndex() {
        Solution solution = new Solution();
        Assertions.assertEquals(-1, solution.pivotIndex(new int[]{1,2,3}));
        Assertions.assertEquals(3, solution.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}