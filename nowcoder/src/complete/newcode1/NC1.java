package complete.newcode1;

/**
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * （字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
 * 示例1
 * 输入
 * "1","99"
 * 返回值
 * "100"
 * 说明
 * 1+99=100
 * @author zhengyingshun
 * @date 2021/3/28 19:50
 */
public class NC1 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        StringBuilder sb = new StringBuilder();
        int j = 0;

        // 使得s的位数较小
        if (s.length() > t.length()) {
            String tmp = s;
            s = t;
            t = tmp;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
//            int sum = Character.getNumericValue(s.charAt(i)) + Character.getNumericValue(t.charAt(i)) + j;
            int sum = s.charAt(i) - '0' + t.charAt(i) - '0' + j;
            j = sum / 10;
            sb.append(sum % 10);
        }

        for (int k = t.length() - s.length() - 1; k >= 0; k--) {
            int sum = Character.getNumericValue(t.charAt(k)) + j;
            j = sum / 10;
            sb.append(sum % 10);
            sb.append(sum);
        }

        if (j != 0) {
            sb.append(j);
        }

        // write code here
        return sb.reverse().toString();
    }

}
