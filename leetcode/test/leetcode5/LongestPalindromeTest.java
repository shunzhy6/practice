package leetcode5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void longestPalindrome1() throws Exception {
        String rome = longestPalindrome.longestPalindrome("babad");
        Assert.assertEquals("aba", rome);
    }

    @Test
    public void longestPalindrome2() throws Exception {
        String rome = longestPalindrome.longestPalindrome("cbbd");
        Assert.assertEquals("bb", rome);
    }

    @Test
    public void longestPalindrome3() throws Exception {
        String rome = longestPalindrome.longestPalindrome("a");
        Assert.assertEquals("a", rome);
    }

    @Test
    public void longestPalindrome4() throws Exception {
        String rome = longestPalindrome.longestPalindrome("ac");
        Assert.assertEquals("a", rome);
    }

    @Test
    public void longestPalindrome5() throws Exception {
        String rome = longestPalindrome.longestPalindrome("abb");
        Assert.assertEquals("bb", rome);
    }

}