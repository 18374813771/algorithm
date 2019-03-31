package sort.sortImpl;

import sort.Sort;
import sort.help.SortHelper;

/**
 * 选择排序，根据排序需要每次选择相应的值放在排序应该在的位置上，排一次之后缩小一次范围
 * 复杂度为n^2
 * @author dhx
 * */
public class SelectSort implements Sort {

    @Override
    public void sort(int[] array){
        int sortIndex = 0;
        for(int i = 0;i < array.length; i++){
            sortIndex = i;
            for (int j =i;j< array.length;j++){
                if (array[j]<array[sortIndex]){
                    sortIndex = j;
                }
            }
            //交换位置
            SortHelper.arraySwap(array,i,sortIndex);
        }
    }
}
