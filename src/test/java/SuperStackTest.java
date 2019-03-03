import com.pickyourtrail.test.SuperStack;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class SuperStackTest {
    private static final String EMPTY="EMPTY";

    private static Logger log= Logger.getLogger(SuperStackTest.class.getName());
    @Test
    public void testStack(){
        int size=12;
        SuperStack superStack=new SuperStack(size);
        String topOfStack = superStack.pushHelper(4);
        log.info(topOfStack);
        Assert.assertEquals("4",topOfStack);
        topOfStack = superStack.popHelper();
        log.info(topOfStack);
        Assert.assertEquals(EMPTY,topOfStack);
        topOfStack = superStack.pushHelper(3);
        log.info(topOfStack);
        Assert.assertEquals("3",topOfStack);
        topOfStack = superStack.pushHelper(5);
        log.info(topOfStack);
        Assert.assertEquals("5",topOfStack);
        topOfStack = superStack.pushHelper(2);
        log.info(topOfStack);
        Assert.assertEquals("2",topOfStack);
        topOfStack = superStack.incHelper(3,1);
        log.info(topOfStack);
        Assert.assertEquals("2",topOfStack);
        topOfStack = superStack.popHelper();
        log.info(topOfStack);
        Assert.assertEquals("6",topOfStack);
        topOfStack = superStack.pushHelper(1);
        log.info(topOfStack);
        Assert.assertEquals("1",topOfStack);
        topOfStack = superStack.incHelper(2,2);
        log.info(topOfStack);
        Assert.assertEquals("1",topOfStack);
        topOfStack = superStack.pushHelper(4);
        log.info(topOfStack);
        Assert.assertEquals("4",topOfStack);
        topOfStack = superStack.popHelper();
        log.info(topOfStack);
        Assert.assertEquals("1",topOfStack);
        topOfStack = superStack.popHelper();
        log.info(topOfStack);
        Assert.assertEquals("8",topOfStack);
    }

    @Test
    public void testStack1(){
        int size=3;
        SuperStack superStack=new SuperStack(size);
        String topOfStack = superStack.incHelper(1, 1);
        log.info(topOfStack);
        Assert.assertEquals(EMPTY,topOfStack);
    }

    @Test
    public void testEmptyStack(){
        int size=3;
        SuperStack superStack=new SuperStack(size);
        superStack.popHelper();
    }

    @Test
    public void testStackFull(){
        int size=1;
        SuperStack superStack=new SuperStack(size);
        superStack.pushHelper(1);
        superStack.pushHelper(2);
        superStack.popHelper();
    }
}
