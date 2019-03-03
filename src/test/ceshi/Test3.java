package test.ceshi;

/**
 * @author times
 * @file Test1.java
 */
public class Test3 {

    public Test3() {
        int[] a = {1, 43, 2, 3523, 33, 66, 2, 35, 788, 32};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void quickSort(int[] a, int s, int end) {
        int mid = a[s];
        int i = s, j = end;
        if (i < j) {
            while (i < j) {
                for (; i < j; j--) {
                    if (a[j] < mid) {
                        a[i++] = a[j];
                        break;
                    }
                }
                for (; i < j; i++) {
                    if (a[i] > mid) {
                        a[j--] = a[i];
                        break;
                    }
                }
            }
            a[i] = mid;
            quickSort(a, s, i - 1);
            quickSort(a, i + 1, end);
        }
    }
}
