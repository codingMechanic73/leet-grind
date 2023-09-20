package concatarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldConcatArrays() {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(solution.getConcatenation(new int[]{1, 2}), new int[]{1, 2, 1, 2});
    }

}