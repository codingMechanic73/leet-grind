package largestcommonprefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldGiveResult() {
        Solution solution = new Solution();
        Assertions.assertEquals("ab", solution.longestCommonPrefix(new String[]{"ab","ab"}));
    }

}