public class ShellSort {
    public void sort(int[] array){
        int temp;
        int n = 1;
        while (n*3+1 < array.length){
            n = n*3+1;
        }
        while (n > 0){
            for (int i = n;i< array.length;i+=n){
                temp = array[i];
                int j = i;
                while (j>0&& array[j-n]>= temp){
                    array[j] =array[j-n];
                    j-= n;
                }
                array[j] = temp;
            }
            n = (n-1)/3;
        }
    }
}
