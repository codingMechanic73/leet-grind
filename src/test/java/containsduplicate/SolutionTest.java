package containsduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void shouldHaveDuplicates() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.containsDuplicate(new int[]{1, 2, 1}));
    }

    @Test
    void shouldNotHaveDuplicates() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.containsDuplicate(new int[]{1, 2, 3}));
    }

}