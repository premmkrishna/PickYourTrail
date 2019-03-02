import com.pickyourtrail.test.CountingPairs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingPairsTest {

    @Test
    public void test1() {
        int[] arr= {1, 1, 2, 2};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 1);
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] arr = {3, 1, 4, 1, 5};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 2);
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int[]  arr = {1, 2, 3, 4, 5};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 1);
        assertEquals(4, result);
    }

    @Test
    public void test4() {
        int[]  arr = {1, 2, 3, 4, 5};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 2);
        assertEquals(3, result);
    }

    @Test
    public void test5() {
        int[] arr = {1, 1, 2, 2, 3, 3};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 1);
        assertEquals(2, result);
    }
}

