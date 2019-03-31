package sort.help;

/**
 * 用于帮助分析算法的类，提供一些简化方法
 */
public class SortHelper {

    public static void arraySwap(int[] array, int i, int j) {
        if (i >= array.length || j >= array.length || i < 0 || j < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 生成int的随机数组
     * @param count 数组大小
     * @param min 数组值的范围最小值
     * @param max 组数值的范围最大值
     * */
    public static int[] randomArray(int count, int min, int max) {
        int[] array = new int[count];
        if (max < min) {
            throw new RuntimeException("请输入正确的范围区间");
        }
        if (count < 0) {
            throw new RuntimeException("数组长度不能为负数");
        }

        //生成随机值的数组
        for (int i = 0; i < count; i++){
            //计算偏移量
            array[i] = (int)((Math.random()*100*count)%(max-min+1)+min);
        }

        return array;
    }

    //打印数组
    public static void printArray(int[] array){
        for (int i =0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }

        System.out.println();
    }

    //判断数组是不是以升序方式排列
    public Boolean isSort(int[] array){
        for (int i = 0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}

