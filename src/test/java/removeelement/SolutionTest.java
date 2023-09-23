package removeelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    @Test
    void shouldRemoveElement() {
        Solution solution = new Solution();
        int[] arr = new int[]{3, 2, 2, 3};
        int k = solution.removeElement(arr, 3);
        Assertions.assertEquals(2, k);
        int[] arrCopy = Arrays.copyOf(arr, k);
        Assertions.assertArrayEquals(new int[]{2, 2}, arrCopy);
    }

}