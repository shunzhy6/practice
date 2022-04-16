package complete.leetcode50;

import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-19
 */
public class Leetcode50E1Test {

    Leetcode50_e1 leetcode50E1 = new Leetcode50_e1();

    @Test
    public void myPow1() {
        double result = leetcode50E1.myPow(2.1, 3);
        System.out.println(result); // 9.261
    }

    @Test
    public void myPow2() {
        double result = leetcode50E1.myPow(2, -2);
        System.out.println(result); // 9.261
    }

    @Test
    public void myPow3() {
        double result = leetcode50E1.myPow(2, -2147483648);
        System.out.println(result); // 9.261
    }

}