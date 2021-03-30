package leetcode22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class L22Test {

    private L22 l22 = new L22();

    @Test
    public void generateParenthesis1() throws Exception {
        List<String> list = l22.generateParenthesis(1);
        // ()
        System.out.println(list);
    }

    @Test
    public void generateParenthesis2() throws Exception {
        List<String> list = l22.generateParenthesis(2);
        // ()(), (())
        System.out.println(list);
    }

    @Test
    public void generateParenthesis3() throws Exception {
        List<String> list = l22.generateParenthesis(3);
        // ()()(), (()()), ((())), ()(()), (())()
        System.out.println(list);
    }

    @Test
    public void generateParenthesis4() throws Exception {
        List<String> list = l22.generateParenthesis(4);
        // ()()(), (()()), ((())), ()(()), (())()
        System.out.println(list);
    }

}