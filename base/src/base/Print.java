package base;

import java.util.Arrays;

/**
 * @author zhengyingshun <zhengyingshun@kuaishou.com>
 * Created on 2022-03-14
 */
public class Print {

    public static<T> void print(T[][] ts) {
        for (T[] t : ts) {
            System.out.print(Arrays.toString(t) + ",");
        }
        System.out.println();
    }

    public static void print(int[][] ts) {
        for (int[] t : ts) {
            System.out.print(Arrays.toString(t) + ",");
        }
        System.out.println();
    }

}
