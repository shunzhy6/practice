package complete.leetcode43;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-02-15
 */
public class Leetcode43Test {

    Leetcode43 leetcode43 = new Leetcode43();

    @Test
    public void multiply1() {
        String result = leetcode43.multiply("1234", "523");
        Assert.assertEquals(result, "645382");
    }

    @Test
    public void multiply2() {
        String result = leetcode43.multiply("123443424344", "5123323");
        Assert.assertEquals(result, "632440535140375112");
    }

    @Test
    public void multiply3() {
        String result = leetcode43.multiply("1223134", "5123");
        Assert.assertEquals(result, "6266115482");
    }

    @Test
    public void multiply4() {
        String result = leetcode43.multiply("12312334", "542523");
        Assert.assertEquals(result, "6679724378682");
    }

    @Test
    public void multiply5() {
        String result = leetcode43.multiply("345151454535153342424231234",
                "3451423451454535153342424231234");
        Assert.assertEquals(result, "1191263824486272019237521561530024654961491740195901162756");
    }

    @Test
    public void multiply6() {
        String result = leetcode43.multiply("345151454000023123400",
                "3451423451454535153342424231234");
        Assert.assertEquals(result, "1191263822639311031715288047093412112448468516275600");
    }

    @Test
    public void multiply7() {
        String result = leetcode43.multiply("345151454000023123400", "0");
        Assert.assertEquals(result, "0");
    }

    @Test
    public void multiply8() {
        String result = leetcode43.multiply("0", "3451423451454535153342424231234");
        Assert.assertEquals(result, "0");
    }


}