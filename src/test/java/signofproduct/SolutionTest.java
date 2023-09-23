package signofproduct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findProductSign() {
        Solution solution = new Solution();
        Assertions.assertEquals(1, solution.arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
        Assertions.assertEquals(0, solution.arraySign(new int[]{1,5,0,2,-3}));
        Assertions.assertEquals(-1, solution.arraySign(new int[]{-1,1,-1,1,-1}));
    }

}