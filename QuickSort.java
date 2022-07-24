public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) return;

        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("\nBefore Sort");
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }


        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("\nAfter Sort");
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }

    }
}
