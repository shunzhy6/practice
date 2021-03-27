package sort.quicksort;

public class QuickSort1 {

    public void fastSort(int [] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int t = start;
        int left = start;
        int right = end;
        while (start < end) {
            while (end > 0 && input[end] >= input[t]) {
                end--;
            }
            int tmp = input[end];
            input[end] = input[t];
            input[t] = tmp;
            t = end;

            while (start < end && input[start] < input[t]) {
                start++;
            }
            tmp = input[start];
            input[start] = input[t];
            input[t] = tmp;
            t = start;
        }

        this.fastSort(input, left, t - 1);
        this.fastSort(input, t + 1, right);
    }

}
