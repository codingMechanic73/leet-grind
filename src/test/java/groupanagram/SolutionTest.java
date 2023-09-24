package groupanagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void groupAnagram() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size());
        Assertions.assertEquals(3, solution.groupAnagramsOptimized(new String[]{"eat","tea","tan","ate","nat","bat"}).size());
    }
}