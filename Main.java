import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i=0;i<x.length;i++) {
            x[i] =(int) (Math.random() * 201 - 100);
        }
        System.out.println("\nBefore Sort");
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }


        int low = 0;
        int high = x.length - 1;

        QuickSort.quickSort(x, low, high);
        System.out.println("\nAfter Sort");
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }

    }
}
