package designparking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testSolution() {
        Solution solution = new Solution(1, 1, 0);
        Assertions.assertTrue(solution.addCar(1));
        Assertions.assertTrue(solution.addCar(2));
        Assertions.assertFalse(solution.addCar(3));
        Assertions.assertFalse(solution.addCar(1));
    }

}