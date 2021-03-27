package sort.insertsort;

import org.junit.Test;

import java.util.ArrayList;

public class InsertSortTest {

    private InsertSort insertSort = new InsertSort();

    @Test
    public void insertSort() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(14);
        list.add(18);
        list.add(23);
        list.add(231);
        insertSort.insertSort(list, 9);

        System.out.println(list.toString());
    }

}