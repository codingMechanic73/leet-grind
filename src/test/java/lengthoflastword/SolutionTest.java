package lengthoflastword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldCountLastWord() {
        Solution solution = new Solution();
        Assertions.assertEquals(5, solution.lengthOfLastWord("Hello World"));
        Assertions.assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

}