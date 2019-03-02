import com.pickyourtrail.test.SuperStack;
import org.junit.Test;

public class SuperStackTest {

    @Test
    public void testStack(){
        int size=12;
        SuperStack superStack=new SuperStack(size);
        superStack.pushHelper(4);
        superStack.popHelper();
        superStack.pushHelper(3);
        superStack.pushHelper(5);
        superStack.pushHelper(2);
        superStack.incHelper(3,1);
        superStack.popHelper();
        superStack.pushHelper(1);
        superStack.incHelper(2,2);
        superStack.pushHelper(4);
        superStack.popHelper();
        superStack.popHelper();
    }

    @Test
    public void testStack1(){
        int size=3;
        SuperStack superStack=new SuperStack(size);
        superStack.incHelper(1,1);
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
