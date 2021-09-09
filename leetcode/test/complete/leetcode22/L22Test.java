package complete.leetcode22;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class L22Test {

    private L22 l22 = new L22();

    @Test
    public void generateParenthesis1() throws Exception {
        List<String> list = l22.generateParenthesis(1);
        Assert.assertEquals("[()]", list.toString());
    }

    @Test
    public void generateParenthesis2() throws Exception {
        List<String> list = l22.generateParenthesis(2);
        Assert.assertEquals("[()(), (())]", list.toString());
    }

    @Test
    public void generateParenthesis3() throws Exception {
        List<String> list = l22.generateParenthesis(3);
        Assert.assertEquals("[()()(), (()()), ((())), ()(()), (())()]", list.toString());
    }

//    @Test
//    public void generateParenthesis4() throws Exception {
//        List<String> list = l22.generateParenthesis(4);
//        Assert.assertEquals("[()()(), (()()), ((())), ()(()), (())()]", list.toString());
//    }

}