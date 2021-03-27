package sort.quicksort;

public class QuickSort2 {

    public void fastSort(int [] input) {
        this.fastSort(input, 0, input.length - 1);
    }

    public void fastSort(int [] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int partition = this.partition(input, start, end);

        this.fastSort(input, start, partition - 1);
        this.fastSort(input, partition + 1, end);
    }

    /**
     * 优化后的快排
     * @author zhengyingshun
     * @date 2021/3/27 11:11
     */
    private int partition(int[] input, int start, int end) {
        int pivot = input[start];
        while (start < end) {
            while (start < end && input[end] >= pivot) {
                end--;
            }
            if (start < end) {
                input[start++] = input[end];
            }

            while (start < end && input[start] < pivot) {
                start++;
            }
            if (start < end) {
                input[end--] = input[start];
            }
        }
        input[start] = pivot;

        return start;
    }

}
