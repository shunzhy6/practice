package complete.leetcode5;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void longestPalindrome1() throws Exception {
        String rome = longestPalindrome.longestPalindrome("babad");
        Assert.assertEquals("bab", rome);
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

    @Test
    public void longestPalindrome6() throws Exception {
        String rome = longestPalindrome.longestPalindrome("safadfadfasdfsefadefsafadfdfafeffffeafadtattarrattaadfsfstsefsfaee");
        Assert.assertEquals("attarratta", rome);
    }

    @Test
    public void longestPalindrome7() throws Exception {
        String rome = longestPalindrome.longestPalindrome("babaddtattarrattatddetartrateedredividerb");
        Assert.assertEquals("ddtattarrattatdd", rome);
    }

    @Test
    public void longestPalindrome8() throws Exception {
        String rome = longestPalindrome.longestPalindrome("bb");
        Assert.assertEquals("bb", rome);
    }

}