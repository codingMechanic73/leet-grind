package mergestringalternatively;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldMergeStrings() {
        Solution solution = new Solution();
        Assertions.assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
        Assertions.assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
        Assertions.assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }

}