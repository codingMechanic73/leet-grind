package reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldReverse() {
        Solution solution = new Solution();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        Assertions.assertArrayEquals(new char[]{'o','l','l','e','h'}, input);
    }
}