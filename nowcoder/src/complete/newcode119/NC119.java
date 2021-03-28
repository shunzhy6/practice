package complete.newcode119;

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
public class NC119 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k > input.length) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = input[0];
        for (int i : input) {
            if (list.size() < k) {
                list.add(i);
                max = max < i ? i : max;
                if (list.size() == k) {
                    this.quickSort(list);
                }
            } else {
                if (max < i) {
                    continue;
                }
                list.remove(list.size() - 1);
                this.insertSort(list, i);
                max = list.get(list.size() - 1);
            }
        }

        return list;
    }

    /**
     * 快排
     * @author zhengyingshun
     * @date 2021/3/27 12:04
     */
    private void quickSort(ArrayList<Integer> list) {
        this.quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(ArrayList<Integer> list, int start, int end) {
        if (start >= end) {
            return;
        }

        int partition = this.partition(list, start, end);
        this.quickSort(list, start, partition - 1);
        this.quickSort(list, partition + 1, end);
    }

    private int partition(ArrayList<Integer> list, int start, int end) {
        int tmp = list.get(start);
        while (start < end) {
            while (start < end && list.get(end) >= tmp) {
                end--;
            }
            if (start < end) {
                list.set(start++, list.get(end));
            }
            while (start < end && list.get(start) < tmp) {
                start++;
            }
            if (start < end) {
                list.set(end--, list.get(start));
            }
        }
        list.set(start, tmp);

        return start;
    }

    /**
     * 插入排序
     * @author zhengyingshun
     * @date 2021/3/27 13:43
     */
    private void insertSort(ArrayList<Integer> list, int value) {
        this.insertSort(list, 0, list.size() - 1, value);
    }

    private void insertSort(ArrayList<Integer> list, int left, int right, int value) {
        if (left >= right) {
            list.add(left, value);
            return;
        }
        int mid = (left + right) / 2;
        if (list.get(mid) > value) {
            this.insertSort(list, left, mid, value);
        } else {
            this.insertSort(list, mid + 1, right, value);
        }
    }

}
