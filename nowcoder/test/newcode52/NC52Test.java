package newcode52;

import org.junit.Test;

public class NC52Test {

    private NC52 nc52 = new NC52();

    @Test
    public void check1() throws Exception {
        boolean flag = nc52.check("(");
        System.out.println(flag);
    }

    @Test
    public void check2() throws Exception {
        boolean flag = nc52.check("[]()");
        System.out.println(flag);
    }

    @Test
    public void check3() throws Exception {
        boolean flag = nc52.check("[{](})");
        System.out.println(flag);
    }

}