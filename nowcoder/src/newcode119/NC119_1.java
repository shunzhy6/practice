package newcode119;

import java.util.ArrayList;

/**
 * 给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4。如果K>数组的长度，那么返回一个空的数组
 * 示例1
 * 输入
 * [4,5,1,6,2,7,3,8],4
 * 返回值
 * [1,2,3,4]
*/
public class NC119_1 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k > input.length) {
            return null;
        }

        this.fastSort(input, 0, input.length - 1, k);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }

        return list;
    }

    public void fastSort(int [] input, int start, int end, int k) {
        if (start >= end) {
            return;
        }
        int partition = this.partition(input, start, end);

        this.fastSort(input, start, partition - 1, k);
        if (partition < k) {
            this.fastSort(input, partition + 1, end, k);
        }
    }

    /**
     * 优化后的快排
     * @author zhengyingshun
     * @date 2021/3/27 11:11
     */
    private int partition(int[] input, int start, int end) {
        int partition = input[start];
        while (start < end) {
            while (start < end && input[end] >= partition) {
                end--;
            }
            if (start < end) {
                input[start++] = input[end];
            }

            while (start < end && input[start] < partition) {
                start++;
            }
            if (start < end) {
                input[end--] = input[start];
            }
        }
        input[start] = partition;

        return start;
    }

}
