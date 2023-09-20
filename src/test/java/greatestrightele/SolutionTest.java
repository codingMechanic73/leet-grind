package greatestrightele;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldReplaceElements() {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(new int[]{18,6,6,6,1,-1}, solution.replaceElements(new int[]{17,18,5,4,6,1}));
    }

}