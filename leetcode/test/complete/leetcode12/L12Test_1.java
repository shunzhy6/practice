package complete.leetcode12;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2021-09-06
 */
public class L12Test_1 extends TestCase {

    L12_1 l12 = new L12_1();

    @Test
    public void testIntToRoman1() {
        String roman = l12.intToRoman(3);
        Assert.assertEquals(roman, "III");
    }

    @Test
    public void testIntToRoman2() {
        String roman = l12.intToRoman(4);
        Assert.assertEquals(roman, "IV");
    }

    @Test
    public void testIntToRoman3() {
        String roman = l12.intToRoman(9);
        Assert.assertEquals(roman, "IX");
    }

    @Test
    public void testIntToRoman4() {
        String roman = l12.intToRoman(58);
        Assert.assertEquals(roman, "LVIII");
    }

    @Test
    public void testIntToRoman5() {
        String roman = l12.intToRoman(1994);
        Assert.assertEquals(roman, "MCMXCIV");
    }

    @Test
    public void testIntToRoman6() {
        String roman = l12.intToRoman(40);
        Assert.assertEquals(roman, "XL");
    }

    @Test
    public void testIntToRoman7() {
        String roman = l12.intToRoman(90);
        Assert.assertEquals(roman, "XC");
    }

    @Test
    public void testIntToRoman8() {
        String roman = l12.intToRoman(400);
        Assert.assertEquals(roman, "CD");
    }

    @Test
    public void testIntToRoman9() {
        String roman = l12.intToRoman(900);
        Assert.assertEquals(roman, "CM");
    }

    @Test
    public void testIntToRoman10() {
        String roman = l12.intToRoman(10);
        Assert.assertEquals(roman, "X");
    }

    @Test
    public void testIntToRoman11() {
        String roman = l12.intToRoman(60);
        Assert.assertEquals(roman, "LX");
    }

}