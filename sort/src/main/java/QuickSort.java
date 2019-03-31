public class QuickSort {
    public void sort(int[] array, int left, int right) {
        int cut;
        int temp;
        if (right <= left) {
            return;
        } else {
            cut = array[left];
            int i = left;
            int j = right;
            while (true) {

                while (array[j] >= cut && i < j) {
                    j--;
                }
                //从左向右查，当大于切割点时停止
                while (array[i] <= cut && i < j) {
                    i++;
                }

                //交换i和j
                if (i >= j) {
                    break;
                } else {
                    temp = array[i];
                    array[i] = array[j];
                }
                array[j] = temp;

            }
            array[left] = array[i];
            array[i] = cut;
            //对左半数组递归
            sort(array, left, i - 1);
            //对右半数组递归
            sort(array, i + 1, right);

        }

    }


}
