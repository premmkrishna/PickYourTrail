import com.pickyourtrail.test.MinimumUniqueSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumUniqueSumTest {

    @Test
    public void test1() {
        int[] arr = {1, 2, 2};
        MinimumUniqueSum minimumUniqueSum = new MinimumUniqueSum();
        int result = minimumUniqueSum.findMinUniqueSum(arr);
        assertEquals(6, result);
    }

    @Test
    public void test2() {
        int []arr = {1, 1, 1};
        MinimumUniqueSum minimumUniqueSum = new MinimumUniqueSum();
        int result = minimumUniqueSum.findMinUniqueSum(arr);
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        int[] arr = {1,4,6,4,6,6,1};
        MinimumUniqueSum minimumUniqueSum = new MinimumUniqueSum();
        int result = minimumUniqueSum.findMinUniqueSum(arr);
        assertEquals(33, result);
    }

    @Test
    public void test4() {
        int[] arr = {3000,3000};
        MinimumUniqueSum minimumUniqueSum = new MinimumUniqueSum();
        int result = minimumUniqueSum.findMinUniqueSum(arr);
        assertEquals(6001, result);
    }
}
