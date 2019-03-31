package sort.sortProxy;

import sort.Sort;
import sort.help.SortHelper;

/**
 * 使用静态代理方便排序函数的测试，可以动态添加操作
 * */
public class SortProxy implements Sort {
    private Sort sort;

    public SortProxy(Sort sort) {
        this.sort = sort;
    }

    @Override
    public void sort(int[] array) {
        long startTime = System.nanoTime();
        sort.sort(array);
        long endTime = System.nanoTime();


        System.out.println("执行时间"+(endTime-startTime)/1000000+"ms");
        //打印数组
        SortHelper.printArray(array);
    }

}
