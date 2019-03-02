import com.pickyourtrail.test.CountingPairs;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

public class CountingPairsTest {

    private static Logger log= Logger.getLogger(CountingPairsTest.class.getName());

    @Test
    public void test1() {
        int[] arr= {1, 1, 2, 2};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 1);
        log.info(Arrays.toString(arr));
        log.info(valueOf(result));
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] arr = {3, 1, 4, 1, 5};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 2);
        log.info(Arrays.toString(arr));
        log.info(valueOf(result));
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int[]  arr = {1, 2, 3, 4, 5};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 1);
        log.info(Arrays.toString(arr));
        log.info(valueOf(result));
        assertEquals(4, result);
    }

    @Test
    public void test4() {
        int[]  arr = {1, 2, 3, 4, 5};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 2);
        log.info(Arrays.toString(arr));
        log.info(valueOf(result));
        assertEquals(3, result);
    }

    @Test
    public void test5() {
        int[] arr = {1, 1, 2, 2, 3, 3};
        CountingPairs countingPairs = new CountingPairs();
        int result = countingPairs.findPairs(arr, 1);
        log.info(Arrays.toString(arr));
        log.info(valueOf(result));
        assertEquals(2, result);
    }
}

