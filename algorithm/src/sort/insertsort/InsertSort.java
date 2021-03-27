package sort.insertsort;

import java.util.List;

public class InsertSort {

    /**
     * 插入排序
     * @author zhengyingshun
     * @date 2021/3/27 13:43
     */
    public void insertSort(List<Integer> list, int value) {
        this.insertSort(list, 0, list.size() - 1, value);
    }

    private void insertSort(List<Integer> list, int left, int right, int value) {
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
