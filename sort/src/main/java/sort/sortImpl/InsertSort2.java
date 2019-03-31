package sort.sortImpl;

import sort.help.SortHelper;

/**
 * 每一次交换就是三次赋值，所有这里可以对插入排序进行优化，不用每次都交换,
 * 可以存一个当前值的复制，找的合适的位置再插入。其他相应的向后移动位置
 *
 * */
public class InsertSort2 extends InsertSort {

    @Override
    public void sort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            temp = array[j];
            while (j > 0 && temp < array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }
}
