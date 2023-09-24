package isomorphicstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "egg, add, true",
            "foo, bar, false",
            "paper, title, true",
    })
    void isIsomorphicStrings(String s, String t, boolean result) {
        Solution solution = new Solution();
        Assertions.assertEquals(result, solution.isIsomorphic(s, t));
    }

}