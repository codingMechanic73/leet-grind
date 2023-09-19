package anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldBeAnAnagram() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldNotBeAnagramWithSameLength() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void shouldNotBeAnagramWithDifferentLength() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isAnagram("ra", "ram"));
    }

}