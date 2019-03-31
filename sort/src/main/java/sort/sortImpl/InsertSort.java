package sort.sortImpl;

import sort.Sort;
import sort.help.SortHelper;

/**
 * 插入排序：原理：将一组数据分成两组，分为为有序组与待插入组。
 * 每次从待插入组中取出一个元素，与有序组的元素进行比较，并找到合适的位置，将该元素插到有序组当中。
 * 因为插入排序满足条件后可以提前终止循环，所有一般来说插入排序的效率应该是大于选择排序。
 * 时间复杂度为 n^2
 * @author dhx
 */
public class InsertSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j-1]) {
                SortHelper.arraySwap(array,j,j-1);
                j--;
            }
        }
    }

    public void sortFor(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                SortHelper.arraySwap(array, j, j - 1);
            }
        }
    }

}
