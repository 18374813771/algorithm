import org.junit.Test;
import sort.sortImpl.BubbleSort;
import sort.sortImpl.InsertSort;
import sort.sortImpl.InsertSort2;
import sort.sortImpl.SelectSort;
import sort.help.SortHelper;
import sort.sortProxy.SortProxy;

public class SortTest {
    SortHelper helper = new SortHelper();

    @Test
    public void insertTest(){
        //随机生成数组
        int[] array = SortHelper.randomArray(10000,500000,600000);
        System.out.println(helper.isSort(array));

        InsertSort insertSort = new InsertSort();
        SortProxy proxy = new SortProxy(insertSort);

        proxy.sort(array);

        //判断sort是否有序
        System.out.println(helper.isSort(array));
    }

    @Test
    public void insertTest2(){
        //随机生成数组
        int[] array = SortHelper.randomArray(10000,500000,600000);
        System.out.println(helper.isSort(array));

        InsertSort2 insertSort2 = new InsertSort2();
        SortProxy proxy = new SortProxy(insertSort2);

        proxy.sort(array);

        //判断sort是否有序
        System.out.println(helper.isSort(array));
    }

    @Test
    public void bubbleTest(){
        int[] array = {5,2,96,6,1,4,5,9,99};
        BubbleSort insertSort = new BubbleSort();
        insertSort.sort(array);
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

    @Test
    public void selectTest(){
        //随机生成数组
        int[] array = SortHelper.randomArray(10000,50000,60000);

        System.out.println(helper.isSort(array));

        SelectSort selectSort = new SelectSort();
        SortProxy proxy = new SortProxy(selectSort);

        proxy.sort(array);

        //判断sort是否有序
        System.out.println(helper.isSort(array));
    }

    @Test
    public void quickTest(){

        QuickSort insertSort = new QuickSort();
        int[] array = {5,2,96,6,1,4,6,6,10,99};
        insertSort.sort(array,0,array.length-1);
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    @Test
    public void shellTest(){

        SelectSort insertSort = new SelectSort();
        int[] array = {5,2,96,6,1,4,6,6,10,99};
        insertSort.sort(array);
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

    @Test
    public void stringTest(){
        String str = "abc";
        String str1 = "ab";
        String str2 = "c";
        String str3 = "ab"+"c";
        String str4 = str1+str2;
        System.out.println(str==str3);
        System.out.println(str==str4);
        System.out.println(str3==str4);

    }
}
