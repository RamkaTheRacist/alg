package Algorithm.s2.HW;

public class t1 {
    static void sort(int[] array){
        int n = array.length;

        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(array,n,i);
        }

        for(int i=n-1; i>=0; i--)
        {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;

            heapify(array,i,0);
        }
    }

    static void heapify(int array[], int n, int i){
        int max = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if((left < n) && (array[left] > array[max])) max = left;

        if((right < n) && (array[right] > array[max])) max = right;

        if(max != i){
            int tmpNum = array[i];
            array[i] = array[max];
            array[max] = tmpNum;

            heapify(array, n, max);
        }
    }
    public static void main(String[] args) {
        int[] array = {12,11,13,5,6,3,7};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
