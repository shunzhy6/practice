package complete.newcode1;

import junit.framework.TestCase;
import org.junit.Assert;

public class NC1Test extends TestCase {

    private NC1 nc1 = new NC1();

    public void testSolve() {
        String result = nc1.solve("1","99");
        Assert.assertEquals("100", result);
    }
}