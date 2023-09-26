package removeduplicatesfromsortarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findDuplicates() {
        Solution solution = new Solution();
        Assertions.assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        Assertions.assertEquals(2, solution.removeDuplicates(new int[]{1,1,2}));
    }
}